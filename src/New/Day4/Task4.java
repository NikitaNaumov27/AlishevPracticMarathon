package New.Day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[100];
        for (int i = 0; i < mas.length; i++){
            mas[i] = random.nextInt(10000);
        }
        int max = 0, index = 0;
        for (int i = 0; i < mas.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += mas[j];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        System.out.println(max + ":" + index);
    }
}
