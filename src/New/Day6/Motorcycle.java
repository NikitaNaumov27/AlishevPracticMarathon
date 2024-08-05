package New.Day6;

public class Motorcycle {
    private int year;
    private String color;
    private String model;

    public Motorcycle(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void getInfo(){
        System.out.println("This is bike");
    }

    public int calcYear (int year){
        return year - this.year;
    }
}
