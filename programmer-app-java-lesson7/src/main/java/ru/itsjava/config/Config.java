package ru.itsjava.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import ru.itsjava.serv.*;

import java.io.InputStream;

@Component
@Configuration
public class Config {

    @Value("${domain.title}")
    private String title;

    @Value("${domain.size}")
    private String size;

    @Value("${domain.color}")
    private String color;

    @Value("${domain.price}")
    private int price;

    @Value("#{T(java.lang.System).in}")
    private InputStream inputStream;

    @Bean
    public ThingService thingService() {
        return new ThingServiceImpl(title, size, color, price);
    }

    @Bean
    public IOService ioService() {
        return new IOServiceImpl(inputStream);
    }

    @Bean
    public Service service(ThingService thingService, IOService ioService) {
        return new ServiceImpl(thingService, ioService) {
        };
    }
}