package music;

public class CDPlayer extends MusicPlayer {
    @Override
    void play(Song song) {
        System.out.println(getClass().getSimpleName().toString() +
                " is playing " + song.getName());
    }
}
