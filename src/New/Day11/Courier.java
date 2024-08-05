package New.Day11;

public class Courier implements Worker {

    private int salary;
    private Warehouse warehouse;

    public Courier(int salary, Warehouse warehouse) {
        this.salary = salary;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() >= 1_000_000) salary *= 2;
    }
}
