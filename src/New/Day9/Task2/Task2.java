package New.Day9.Task2;

public class Task2 {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blued", 5)
        };

        System.out.println(redPerimeter(figures));
        System.out.println(redArea(figures));
    }

     public static double redPerimeter(Figure[] figures){
        double sum = 0;
         for (Figure figure : figures){
             if (figure.getColor().equals("Red")) sum += figure.perimeter();
         }
         return sum;
     }


    public static double redArea(Figure[] figures){
        double sum = 0;
        for (Figure figure : figures){
            if (figure.getColor().equals("Red")) sum += figure.area();
        }
        return sum;
    }
}
