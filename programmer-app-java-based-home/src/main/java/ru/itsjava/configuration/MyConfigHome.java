package ru.itsjava.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ru.itsjava.services.*;

import java.util.Scanner;

@Configuration
public class MyConfigHome {

    @Value("${veryNecessaryThingHome.title}")
    private String title;

    @Value("${veryNecessaryThingHome.size}")
    private String size;

    @Value("${veryNecessaryThingHome.color}")
    private String color;

    @Value("${veryNecessaryThingHome.price}")
    private int price;

    @Value("#{T(java.lang.System).in}")
    private Scanner scanner;

    @Bean
    public VeryNecessaryThingServiceHome veryNecessaryThingHome(){
        return new VeryNecessaryThingServiceHomeImpl(title, size, color, price);
    }

    @Bean
    public IOSeviceHome ioSeviceHome(){
        return new IOSeviceHomeImpl(scanner);
    }

    @Bean
    public BuyerServiceHome buyerServiceHome(VeryNecessaryThingServiceHome veryNecessaryThingHome, IOSeviceHome ioSeviceHome){
        return new BuyerServiceHomeImpl(veryNecessaryThingHome, ioSeviceHome ) {

        };
    }
}
