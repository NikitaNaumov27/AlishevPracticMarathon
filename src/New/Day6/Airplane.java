package New.Day6;

public class Airplane {

    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int vOil;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.vOil = 0;
    }

    public void info(){
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " +
                year + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " +
                vOil);
    }

    public void fillUp(int coll) {
        vOil += coll;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setvOil(int vOil) {
        this.vOil = vOil;
    }
}
