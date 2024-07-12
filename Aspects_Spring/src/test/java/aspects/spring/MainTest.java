package aspects.spring;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testOne() {
        String str1 = "1.5 1.5";
        String str2;
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        ForTest forTest = context.getBean(ForTest.class);
        str2 = forTest.testOne("1.5", 1.5);
        Assert.assertEquals(str1, str2);
    }

    @Test
    void testTwo() {
        String str1 = "Privet Privet";
        String str2;
        Collection<ArrayList> list = new LinkedList<>();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        ForTest forTest = context.getBean(ForTest.class);
        NullPointerException exception = assertThrows(NullPointerException.class, () -> forTest.testTwo(list, null));
        System.out.println(exception.getMessage());
    }
}