package nobel.spring5.di.controllers;

import nobel.spring5.di.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService()); // here i used the setter to inject that service implementation
    }

    @Test
    void setGreetingService() {
        System.out.println(controller.getGreeting());
    }
}