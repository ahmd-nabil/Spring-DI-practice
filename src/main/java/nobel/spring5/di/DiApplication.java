package nobel.spring5.di;

import nobel.spring5.di.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiApplication.class, args);

        I18nController i18nController = context.getBean("i18nController", I18nController.class);
        System.out.println(i18nController.getGreeting());

        System.out.println("====== @Primary Greeting Service");
        MainController mainController = context.getBean("mainController", MainController.class);
        System.out.println(mainController.getGreeting());

        System.out.println("======= Property Injected");
        PropertyInjectedController propertyInjectedController = context.getBean("propertyInjectedController", PropertyInjectedController.class);
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("======= Setter Injected");
        SetterInjectedController setterInjectedController = context.getBean("setterInjectedController", SetterInjectedController.class);
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("======== Constructor Injected 'MOST PREFERRED'");
        ConstructorInjectedController constructorInjectedController = context.getBean("constructorInjectedController", ConstructorInjectedController.class);
        System.out.println(constructorInjectedController.getGreeting());
    }
}
