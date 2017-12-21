package music;

public class LeadGuitarist extends Guitarist {

    @Override
    public void play(Song song) {
        System.out.println(getClass().getSimpleName() + " is playing " + song.getName() +
                " making " + getGuitar().play());
    }
}

