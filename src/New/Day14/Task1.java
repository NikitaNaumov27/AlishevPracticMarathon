package New.Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Task14");

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            if (numbers.length!=10) throw new IllegalArgumentException();

            int sum = 0;

            for (String num : numbers){
                sum += Integer.parseInt(num);
                System.out.print(num + " ");
            }

            System.out.println("\n" + sum);

        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
