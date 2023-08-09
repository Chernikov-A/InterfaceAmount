import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Card card = new Card(0);
        card.put(1000);
        card.getCurrent();
        card.take(500);
        card.getCurrent();

//
//        CreditCard creditCard = new CreditCard(0);
//        creditCard.take(500);
//        creditCard.getCurrent();

//        DepositCard card = new DepositCard(0);
//        card.getCurrent();
//        card.put(1000);
//        card.take(50);
//        card.getCurrent();
    }
}