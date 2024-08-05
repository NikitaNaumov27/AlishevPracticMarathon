package New.Day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(new MusicBand("1", 1999));
        musicBandList.add(new MusicBand("2", 2000));
        musicBandList.add(new MusicBand("3", 2001));
        musicBandList.add(new MusicBand("4", 2002));
        musicBandList.add(new MusicBand("5", 2003));
        musicBandList.add(new MusicBand("6", 1998));
        musicBandList.add(new MusicBand("7", 1997));
        musicBandList.add(new MusicBand("8", 1996));
        musicBandList.add(new MusicBand("9", 2000));
        musicBandList.add(new MusicBand("10", 1993));

        Collections.shuffle(musicBandList);

        System.out.println(musicBandList);

        List<MusicBand> musicBandList2 = new ArrayList<>();

        for (MusicBand musicBand : musicBandList){
            if (musicBand.getYear() > 2000) musicBandList2.add(musicBand);
        }

        System.out.println(musicBandList2);


    }
}
