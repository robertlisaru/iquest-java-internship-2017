package music;

import java.util.List;

public class IPod extends MusicPlayer {

    @Override
    void play(Song song) {
        System.out.println(getClass().getSimpleName().toString() +
                " is playing " + song.getName());
    }
}
