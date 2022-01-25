package ru.itsjava.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("context.xml");
        ProgrammerService programmerService = context.getBean("programmerService", ProgrammerService.class);

        programmerService.hiToNewProgrammer();
    }
}
