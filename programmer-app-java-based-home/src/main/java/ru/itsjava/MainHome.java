package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.itsjava.services.BuyerServiceHome;

@Configuration
@ComponentScan("ru.itsjava.configuration")
@PropertySource("classpath:appHome.properties")
public class MainHome {

    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(MainHome.class);
        BuyerServiceHome buyerServiceHome = context.getBean("buyerServiceHome", BuyerServiceHome.class);

        buyerServiceHome.takeYourProduct();
    }
}
