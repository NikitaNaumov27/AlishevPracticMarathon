package New.Day11;


public class Picker implements Worker {

    private int salary;
    private Warehouse warehouse;

    public Picker(int salary, Warehouse warehouse) {
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
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder() >= 1500) salary *= 3;
    }
}
