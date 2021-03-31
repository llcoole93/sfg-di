package handler.springframework.sfgdi.controllers;

import handler.springframework.sfgdi.services.ConstructorGreetingsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingsService = new ConstructorGreetingsService();
    }
    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}