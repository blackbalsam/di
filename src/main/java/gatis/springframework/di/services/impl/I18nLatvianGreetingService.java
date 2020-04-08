package gatis.springframework.di.services.impl;

import gatis.springframework.di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"LV", "default"})
@Service("i18nService")
public class I18nLatvianGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Sveika Pasaule - LV";
    }
}
