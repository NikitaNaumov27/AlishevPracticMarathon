package New.Day6;



public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2001, 30, 40000);
        airplane.info();
        airplane.setYear(1999);
        airplane.fillUp(100);
        airplane.info();
        airplane.fillUp(27);
        airplane.info();
    }
}
