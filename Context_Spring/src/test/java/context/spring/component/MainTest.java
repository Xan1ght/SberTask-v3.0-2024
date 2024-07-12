package context.spring.component;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class MainTest {
    @Test
    void main() {
        String str = "Объект 188";
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Human human = context.getBean(Human.class);
        human.getParrotOne().setName(str);
        human.getDog().setName("Вульф");
        System.out.println(human.getParrotOne().getName());
        System.out.println(human.getParrotTwo().getName());
        System.out.println(human.getCat().getName());
        System.out.println(human.getDog().getName());
    }
}