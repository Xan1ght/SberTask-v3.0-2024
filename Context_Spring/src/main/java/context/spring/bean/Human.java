package context.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Human {
    private Parrot parrotOne;
    private Parrot parrotTwo;
    private Cat cat;
    private Dog dog;
}