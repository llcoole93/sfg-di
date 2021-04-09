package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Evan on 4/8/2021
 */
@Scope("singleton")
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("creating a singlton bean!!!!!!");
    }

    public String getMyScope() {
        return "I'm a singleton";
    }
}
