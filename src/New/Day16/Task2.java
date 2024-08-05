package New.Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1");
        File file2 = new File("file2");
        Random random = new Random();
        PrintWriter pw1 = new PrintWriter(file1);
        PrintWriter pw2 = new PrintWriter(file2);
        int sum = 0; double sumDouble = 0;
        for (int i = 0; i < 1000; i++) {
            int x = random.nextInt(100);
            pw1.println(x);
            sum += x;
            if (i % 20 == 0) {
                pw2.println(sum / 20.0);
                sumDouble = sum / 20.0;
                sum = 0;
            }
        }
        pw1.close();
        pw2.close();

        System.out.printf("%.0f",sumDouble);
    }
}
