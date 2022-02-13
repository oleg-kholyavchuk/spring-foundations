package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import ru.itsjava.domain.VeryNecessaryThing;
import ru.itsjava.services.BuyerService;


@EnableAspectJAutoProxy
@ComponentScan("ru.itsjava")
public class Main {

    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(Main.class);
        BuyerService buyerService = context.getBean("buyerServiceImpl", BuyerService.class);

        buyerService.takeYourProduct();
    }
}
