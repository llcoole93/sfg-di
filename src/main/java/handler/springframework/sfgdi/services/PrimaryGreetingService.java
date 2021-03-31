package handler.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by Evan on 03 / 2021
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingsService {

    @Override
    public String sayGreetings() {
        return "hello world - Primary";
    }
}
