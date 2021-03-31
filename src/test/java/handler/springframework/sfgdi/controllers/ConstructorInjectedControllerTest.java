package handler.springframework.sfgdi.controllers;

import handler.springframework.sfgdi.services.ConstructorGreetingsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingsService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}