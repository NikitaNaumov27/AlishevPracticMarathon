package New.Day8;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int VOil;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.VOil = 0;
    }

    public void info(){
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " +
                year + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " +
                VOil);
    }

    public void fillUp(int coll) {
        VOil += coll;
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

    public void setVOil(int vOil) {
        this.VOil = vOil;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getVOil() {
        return VOil;
    }

    public static void airplaneLength (Airplane air1, Airplane air2){
        if (air1.getLength() > air2.getLength()) System.out.println("1 длиннее");
        else if (air1.getLength() < air2.getLength()) System.out.println("2 длиннее");
        else System.out.println("Одинаоковой дилнны");
    }

    @Override
    public String toString() {
        return  "Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " +
                VOil;
    }
}
