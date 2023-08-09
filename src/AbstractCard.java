public class AbstractCard implements InterfaceCard {

    protected double balance;

    public AbstractCard(double amount) {
        this.balance = amount;
    }

    @Override
    public double getCurrent() {
        System.out.println("Баланс вашего счета: " + this.balance);
        return this.balance;
    }

    @Override
    public void put(double amount) {
        balance += amount;
        System.out.println("Пополнение баланса успешно прошло. Сумма пополнения: "+ amount);
    }

    @Override
    public void take(double amount) {
        if (this.balance < amount){
            System.out.println("Недостаточно средств для снятия ");
        }else {
            this.balance -= amount;
            System.out.println("Списание успешно прошло. Сумма списания: " + amount );
        }
    }


}
