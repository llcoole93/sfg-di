package handler.springframework.sfgdi.services;

public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "hello world";
    }
}
