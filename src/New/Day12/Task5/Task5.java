package New.Day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("01", 19));
        members1.add(new MusicArtist("02", 20));
        members1.add(new MusicArtist("03", 13));
        members1.add(new MusicArtist("04", 14));
        members1.add(new MusicArtist("05", 18));
        members1.add(new MusicArtist("06", 19));
        members1.add(new MusicArtist("07", 10));


        MusicBand band1 = new MusicBand("01", 1965, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("21", 11));
        members2.add(new MusicArtist("22", 12));
        members2.add(new MusicArtist("23", 13));
        members2.add(new MusicArtist("24", 14));

        MusicBand band2 = new MusicBand("02",1960,members2);

        band1.print();
        band2.print();

        MusicBand.transferMembers(band1,band2);

        band1.print();
        band2.print();
    }
}
