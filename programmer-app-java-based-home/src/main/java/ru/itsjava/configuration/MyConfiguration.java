package ru.itsjava.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ru.itsjava.services.*;

import java.io.InputStream;

@Configuration
public class MyConfiguration {

    @Value("${veryNecessaryThing.title}")
    private String title;

    @Value("${veryNecessaryThing.size}")
    private String size;

    @Value("${veryNecessaryThing.color}")
    private String color;

    @Value("${veryNecessaryThing.price}")
    private int price;

    @Value("#{T(java.lang.System).in}")
    private InputStream inputStream;

    @Bean
    public VeryNecessaryThingService veryNecessaryThingService() {
        return new VeryNecessaryThingServiceImpl(title, size, color, price);
    }

    @Bean
    public IOService ioService() {
        return new IOServiceImpl(inputStream);
    }

    @Bean
    public BuyerService buyerService(VeryNecessaryThingService veryNecessaryThing, IOService ioService) {
        return new BuyerServiceImpl(veryNecessaryThing, ioService) {
        };
    }
}
