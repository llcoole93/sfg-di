package handler.springframework.sfgdi.controllers;

import handler.springframework.sfgdi.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingsService greetingsService;

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreetings() {
        return greetingsService.sayGreetings();
    }
}
