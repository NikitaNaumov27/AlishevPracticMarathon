package New.Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите кол-во элементов в масиве:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(arr));
        int count8 = 0, count1 = 0, countchet = 0, countnechet = 0, sum = 0;
        System.out.println("Длина масива: " + arr.length);
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 8) count8++;
            if (arr[i] == 1) count1++;
            if (arr[i] % 2 == 0) countchet++;
            if (arr[i] % 3 == 0) countnechet++;
            sum += arr[i];
        }
        System.out.println("Кол-во >8:" + count8 + ". Кол-во =1:" + count1 + ". Четных:" +
                countchet + ". Нечетных:" + countnechet + ". Сумма:" + sum);
    }
}
