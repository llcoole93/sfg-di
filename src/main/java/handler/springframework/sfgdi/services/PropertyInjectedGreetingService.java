package handler.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by Evan on 03/ 2021
 */

@Service
public class PropertyInjectedGreetingService implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "hello world property";
    }
}
