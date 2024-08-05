package New.Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int sum = 0;
            for (String str : numbers){
                sum += Integer.parseInt(str);
            }
            double result = sum / (double)numbers.length;
            System.out.println("Полная запись: " + result);
            System.out.printf("Сокращенная запись: %.3f", result);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
