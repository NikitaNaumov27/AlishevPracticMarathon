package New.Day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(1499,999999);
        Picker picker = new Picker(0,warehouse);
        Courier courier = new Courier(0, warehouse);

        picker.doWork();
        courier.doWork();
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());
        System.out.println(warehouse.getBalance());
        System.out.println(warehouse.getCountOrder());
        picker.bonus();
        courier.bonus();
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());


    }
}
