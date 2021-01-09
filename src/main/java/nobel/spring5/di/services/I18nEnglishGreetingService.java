package nobel.spring5.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnglishGreetingService  implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World -EN";
    }
}
