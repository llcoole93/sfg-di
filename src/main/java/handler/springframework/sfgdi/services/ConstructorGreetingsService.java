package handler.springframework.sfgdi.services;


import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingsService implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "hello world constructor";
    }
}
