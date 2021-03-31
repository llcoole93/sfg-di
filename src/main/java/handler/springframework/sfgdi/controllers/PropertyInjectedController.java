package handler.springframework.sfgdi.controllers;

import handler.springframework.sfgdi.services.GreetingsService;

public class PropertyInjectedController {

    public GreetingsService greetingsService;

    public String getGreeting() {
        return greetingsService.sayGreetings();
    }
}
