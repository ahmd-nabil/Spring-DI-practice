package nobel.spring5.di.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hi ppl - Property Greeting Service";
    }
}
