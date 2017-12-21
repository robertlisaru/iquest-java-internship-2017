package music;

import java.util.ArrayList;
import java.util.List;

public class Band {
    private Drummer drummer = new Drummer();
    private List<Guitarist> guitarists = new ArrayList<>();

    public Band() {
        guitarists.add(new LeadGuitarist());
        guitarists.add(new RhythmGuitarist());
        guitarists.add(new BassGuitarist());
    }

    public void playLive(Song song) {
        drummer.play(song);
        for (Guitarist g : guitarists) {
            g.play(song);
        }
    }
}
