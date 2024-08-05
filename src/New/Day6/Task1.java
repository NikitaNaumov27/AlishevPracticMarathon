package New.Day6;


public class Task1 {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setColor("Red");
        auto.setModel("BMW");
        auto.setYear(1999);

        Motorcycle bike = new Motorcycle(1993, "Black", "Kawasaki");

        auto.getInfo();
        bike.getInfo();

        System.out.println(auto.calcYear(2000));
        System.out.println(bike.calcYear(2000));
    }
}
