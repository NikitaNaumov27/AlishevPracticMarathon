package New.Day5;

public class Task1 {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setYear(1999);
        auto.setColor("red");
        auto.setModel("BMW");

        System.out.println("Model: " + auto.getModel() + ". Year: " +
                auto.getYear() + ". Color: " + auto.getColor());
    }
}
