package context.spring.component;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Human {
    @Autowired
    private Parrot parrotOne;
    @Autowired
    private Parrot parrotTwo;
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
}