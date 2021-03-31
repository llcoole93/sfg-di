package handler.springframework.sfgdi.controllers;

import handler.springframework.sfgdi.services.ConstructorGreetingsService;
import handler.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingsService greetingsService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingsService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return greetingsService.sayGreetings();
    }
}
