package New.Day8;

public class Task1 {
    public static void main(String[] args) {
        String str = "";
        double before = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++){
            str += i + " ";
        }
        double after = System.currentTimeMillis();
        System.out.println(after-before);

        System.out.println();

        before = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i <= 20000; i++){
            sb.append(i).append(" ");
        }

        after = System.currentTimeMillis();

        System.out.println(after-before);
    }
}
