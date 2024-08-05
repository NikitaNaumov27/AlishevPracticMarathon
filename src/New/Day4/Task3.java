package New.Day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] mas = new int[12][8];
        int sum = 0, max = 0, counter = 0;
        for (int i = 0; i < mas.length; i++){
            sum = 0;
            for (int j = 0; j < mas[i].length; j++){
                mas[i][j] = random.nextInt(50);
                sum += mas[i][j];
                System.out.printf("%-4d", mas[i][j]);
            }
            if (sum > max) {
                max = sum;
                counter = i;
            }
            System.out.println();
        }
        System.out.println(max + ":" + counter);
    }
}
