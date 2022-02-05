package ru.itsjava;

import ru.itsjava.services.BuyerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ru.itsjava")
public class Main {

    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(Main.class);

        BuyerService buyerService = context.getBean("buyerServiceImpl", BuyerService.class);
        buyerService.takeYourProduct();
    }
}
