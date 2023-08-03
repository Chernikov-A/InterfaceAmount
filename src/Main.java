import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Card card = new Card();
//        card.put(1000);
//        card.getCurrent();
//        card.take(5000);
//        card.getCurrent();

//
//        CreditCard creditCard = new CreditCard();
//        creditCard.take(500);
//        creditCard.getCurrent();

        DepositCard card = new DepositCard();
        card.getCurrent();
        card.put(100);
        card.take(101);
        card.getCurrent();
    }
}