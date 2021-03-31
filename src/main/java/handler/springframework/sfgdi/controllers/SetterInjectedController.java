package handler.springframework.sfgdi.controllers;

import handler.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingsService greetingsService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreetings() {
        return greetingsService.sayGreetings();
    }
}
