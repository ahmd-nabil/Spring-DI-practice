package nobel.spring5.di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hi ppl - Setter Greeting Service";
    }
}
