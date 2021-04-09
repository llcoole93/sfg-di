package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Evan on 4/8/2021
 */
@Scope("prototype")
@Component
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Creating prototype bean!!!!!!");
    }

    public String getMyScope() {
        return "I'm a prototype";
    }
}
