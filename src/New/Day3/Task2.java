package New.Day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Введите делимое:");
            double dividend = scanner.nextDouble();
            System.out.print("Введите делитель:");
            double divider = scanner.nextDouble();
            if (divider == 0) break;
            else System.out.println(dividend/divider);
        }
    }
}
