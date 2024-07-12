package context.spring.task2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    App application() {
        App app = new App();
        app.setBankClientsApp(bankClientsApp());
        app.setDataBase(dataBase());
        app.setTransferByPhoneApp(transferByPhoneApp());
        return app;
    }

    @Bean
    BankClientsApp bankClientsApp() {
        BankClientsApp bankClientsApp = new BankClientsApp();
        bankClientsApp.setClients(false);
        return bankClientsApp;
    }

    @Bean
    DataBase dataBase() {
        DataBase dataBase = new DataBase();
        dataBase.setStory("переведено 12.07.24 на сумму");
        return dataBase;
    }

    @Bean
    TransferByPhoneApp transferByPhoneApp() {
        TransferByPhoneApp transferByPhoneApp = new TransferByPhoneApp();
        transferByPhoneApp.setNumber("88005553535");
        transferByPhoneApp.setSum("5000");
        return transferByPhoneApp;
    }
}