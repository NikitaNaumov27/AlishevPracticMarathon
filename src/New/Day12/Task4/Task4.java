package New.Day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("10");
        members1.add("11");
        members1.add("12");
        members1.add("13");
        members1.add("14");
        members1.add("15");
        members1.add("16");

        MusicBand band1 = new MusicBand("01", 1965, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("20");
        members2.add("21");
        members2.add("22");
        members2.add("23");

        MusicBand band2 = new MusicBand("02",1960,members2);

        band1.print();
        band2.print();

        MusicBand.transferMembers(band1,band2);

        band1.print();
        band2.print();
    }
}
