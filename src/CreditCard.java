public class CreditCard extends AbstractCard {
    public CreditCard(double amount) {
        super(amount);
    }

    @Override
    public void take(double amount) {

        if (this.balance < amount){
            System.out.println("Недостаточно средств для снятия ");
        }else {
            amount = (amount+(amount*0.01));
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
