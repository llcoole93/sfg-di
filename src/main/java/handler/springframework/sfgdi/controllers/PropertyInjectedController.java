package handler.springframework.sfgdi.controllers;

import handler.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingsService greetingsService;

    public String getGreeting() {
        return greetingsService.sayGreetings();
    }
}
