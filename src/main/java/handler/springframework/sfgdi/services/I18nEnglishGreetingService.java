package handler.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Evan on 03 / 2021
 */

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "Hello World - EN";
    }
}
