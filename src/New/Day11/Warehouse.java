package New.Day11;

public class Warehouse {

    private int countOrder;
    private int balance;

    public Warehouse(int countOrder, int balance) {
        this.countOrder = countOrder;
        this.balance = balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Склад{" +
                "Кол-во собранных заказов=" + countOrder +
                ", Доход=" + balance +
                '}';
    }
}
