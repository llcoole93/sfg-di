package handler.springframework.sfgdi.controllers;

import handler.springframework.sfgdi.services.GreetingsService;

public class SetterInjectedController {
    private GreetingsService greetingsService;

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreetings() {
        return greetingsService.sayGreetings();
    }
}
