package ru.itsjava;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.configuration.MyConfig;

@ComponentScan("ru.itsjava.configuration")
public class Main {

    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfig.class);
//        Animal piglet = context.getBean("myBestPiglet", Animal.class);
//        piglet.say();
        KindFarmer farmer = context.getBean("farmer", KindFarmer.class);
        farmer.hiToAnimal();
    }
}
