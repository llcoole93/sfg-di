package handler.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public  String sayHi() {
        System.out.println("hello world");

        return "HI my guy";
    }
}
