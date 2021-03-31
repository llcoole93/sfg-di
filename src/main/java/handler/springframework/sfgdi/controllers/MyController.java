package handler.springframework.sfgdi.controllers;

import handler.springframework.sfgdi.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingsService greetingsService;

    public MyController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public  String sayHi() {

        return greetingsService.sayGreetings();
    }
}
