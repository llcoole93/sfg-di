package handler.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Evan on 03 / 2021
 */
@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "Hola Mondo - ES";
    }
}
