package New.Day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите этаж: ");
        int level = scanner.nextInt();
        if (level >= 1 && level <= 4) System.out.println("Малоэтажный дом");
        else if (level >= 5 && level <= 8) System.out.println("Среднеэтажный дом");
        else if (level >= 9) System.out.println("Многоэтажный дом");
        else System.out.println("Некорректно введенный этаж!");
    }
}
