package handler.springframework.sfgdi.controllers;

import handler.springframework.sfgdi.services.ConstructorGreetingsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingsService(new ConstructorGreetingsService());
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}