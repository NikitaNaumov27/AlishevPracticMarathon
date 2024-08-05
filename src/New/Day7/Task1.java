package New.Day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing1",1999,30,30000);
        Airplane airplane2 = new Airplane("Boeing2",1900,40,30000);
        Airplane.airplaneLength(airplane1,airplane2);
    }
}
