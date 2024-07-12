package context.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrotOne() {
        return new Parrot("Гоша");
    }

    @Bean
    public Parrot parrotTwo() {
        return new Parrot("Карлуша");
    }

    @Bean
    public Cat cat() {
        return new Cat("Мася");
    }

    @Bean
    public Dog dog() {
        return new Dog("Рекс");
    }

    @Bean
    public Human human(Parrot parrotOne, Parrot parrotTwo, Cat cat, Dog dog) {
        return new Human(parrotOne, parrotTwo, cat, dog);
    }
}