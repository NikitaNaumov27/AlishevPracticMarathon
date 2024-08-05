package New.Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[100];
        for (int i = 0; i < mas.length; i++)
            mas[i] = random.nextInt(10001);

        System.out.println(Arrays.toString(mas));

        int min = 100000;
        int max = -1;
        int n0 = 0;
        int sum0 = 0;

        for (int arr : mas) {
            if (arr > max) max = arr;
            if (arr < min) min = arr;
            if (arr % 10 == 0 ) {
                sum0 +=arr;
                n0++;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(n0);
        System.out.println(sum0);
    }
}
