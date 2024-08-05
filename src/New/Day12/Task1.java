package New.Day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bmw");
        list.add("Mercedes");
        list.add("Audi");
        list.add("Porsche");
        list.add("Yamaha");

        System.out.println(list);

        list.add(2,"LI9");
        list.remove(0);
        System.out.println(list);
    }
}
