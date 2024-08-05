package New.Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    public static List<Person> parseFileToStringList(){
        File file = new File("People.txt");
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0) throw new IllegalArgumentException();

                people.add(new Person(Integer.parseInt(person[1]),person[0]));
            }

            return people;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл!");
        }
        return null;
    }
}
