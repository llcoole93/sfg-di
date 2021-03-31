package handler.springframework.sfgdi.controllers;

import handler.springframework.sfgdi.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingsService = new GreetingsServiceImpl();
    }
    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}