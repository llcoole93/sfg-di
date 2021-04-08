package guru.springframework.sfgdi.repository;

/**
 * Created by Evan on 4/8/2021
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
