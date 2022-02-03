package ru.itsjava;

import ru.itsjava.services.ProgrammerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ru.itsjava")
public class Application {

    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(Application.class);

        ProgrammerService programmerService = context.getBean("programmerService", ProgrammerService.class);
        programmerService.takeYourProduct();
    }
}
