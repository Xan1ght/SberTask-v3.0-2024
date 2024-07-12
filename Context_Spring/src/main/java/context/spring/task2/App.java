package context.spring.task2;

import lombok.Data;

@Data
public class App {
    private BankClientsApp bankClientsApp;
    private DataBase dataBase;
    private TransferByPhoneApp transferByPhoneApp;
    void checkUser() {
        if (bankClientsApp.getClients().equals(false)) {
            System.out.println("Вы не наш клиент");
        } else {
            System.out.println("На номер " + transferByPhoneApp.getNumber() + " переведено " + transferByPhoneApp.getSum() + " руб.");
            System.out.println("История номера " + transferByPhoneApp.getNumber() + " " + dataBase.getStory() + " " + transferByPhoneApp.getSum() + " руб.");
        }
    }
}