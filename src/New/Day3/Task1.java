package New.Day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите город:");
        while (true) {
            String city = scanner.nextLine();
            if (city.equals("Stop")) break;
            else if (city.equals("Москва") || city.equals("Владивосток") ||
                    city.equals("Ростов")) System.out.println("Россия");
            else if (city.equals("Рим") || city.equals("Милан") ||
                    city.equals("Турин")) System.out.println("Италия");
            else if (city.equals("Ливерпуль") || city.equals("Манчестер") ||
                    city.equals("Лондон")) System.out.println("Англия");
            else if (city.equals("Берлин") || city.equals("Мюнхен") ||
                    city.equals("Кёльн")) System.out.println("Германия");
            else System.out.println("Неизвестная страна");
        }
    }
}
