package nobel.spring5.di.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello ppl - Constructor Greeting Service";
    }
}
