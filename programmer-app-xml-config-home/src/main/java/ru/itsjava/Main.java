package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.services.BuyerService;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("context.xml");
        BuyerService buyerService = context.getBean("buyerService", BuyerService.class);

        buyerService.takeYourProduct();
    }
}
