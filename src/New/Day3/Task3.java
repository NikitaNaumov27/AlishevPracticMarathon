package New.Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < 5){
            System.out.print("Введите делимое:");
            double dividend = scanner.nextDouble();
            System.out.print("Введите делитель:");
            double divider = scanner.nextDouble();
            counter++;
            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(dividend/divider);
        }
    }
}
