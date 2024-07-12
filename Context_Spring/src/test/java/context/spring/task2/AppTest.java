package context.spring.task2;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class AppTest {
    @Test
    void checkUser() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        App app = context.getBean(App.class);
        app.getBankClientsApp().setClients(true);
        app.checkUser();
        app.getBankClientsApp().setClients(false);
        app.checkUser();
    }
}