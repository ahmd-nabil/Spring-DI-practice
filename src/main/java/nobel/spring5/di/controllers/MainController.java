package nobel.spring5.di.controllers;

import nobel.spring5.di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    private GreetingService greetingService;

    public MainController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
