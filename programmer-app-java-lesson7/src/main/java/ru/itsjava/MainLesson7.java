package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import ru.itsjava.serv.Service;


@ComponentScan({"ru.itsjava.config"})
@PropertySource("classpath:text.properties")
public class MainLesson7 {

    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(MainLesson7.class);
        Service service = context.getBean("service", Service.class);
        service.takeYourProduct();
    }
}
