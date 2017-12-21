package music;

public class RhythmGuitarist extends Guitarist {

    @Override
    public void play(Song song) {
        System.out.println(getClass().getSimpleName() + " is playing " + song.getName() +
                " making " + getGuitar().play());
    }
}
