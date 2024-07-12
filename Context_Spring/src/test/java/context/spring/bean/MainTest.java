package context.spring.bean;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class MainTest {
    @Test
    void main() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean("parrotOne", Parrot.class);
        System.out.println(parrot.getName());
    }
}
