package New.Day9.Task2;

public class Triangle extends Figure{

    private double a,b,c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double area() {
        double halfPer = perimeter() / 2;
        return  Math.sqrt(halfPer * (halfPer - a) * (halfPer - b) * (halfPer - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
