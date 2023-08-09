import java.time.LocalDate;
import java.time.LocalDateTime;

public class DepositCard extends AbstractCard {
    public LocalDate localDate;

    public DepositCard(double amount) {
        super(amount);
    }

    @Override
    public void take(double amount) {

        LocalDateTime lastUpdate = LocalDateTime.now();
        LocalDateTime now = LocalDateTime.now();


        LocalDateTime nowMinusDay = now.minusDays(0);
        boolean before = nowMinusDay.isBefore(lastUpdate);

        if ((this.balance < amount) && !before){
            System.out.println("Списание невозможно! Последнее снятие денег было: " + lastUpdate );

        } else {
            this.balance -= amount;
            System.out.println("Операция снятие средств успешна прошла. Сумма списание составило: " + amount );

        }
    }
    @Override
    public void put(double amount) {
        super.put(amount);
    }

    @Override
    public double getCurrent() {
        return super.getCurrent();
    }
}
