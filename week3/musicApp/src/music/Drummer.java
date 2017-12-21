package music;

public class Drummer {
    private Drumset drumset = new Drumset();

    public void play(Song song) {
        System.out.println(getClass().getSimpleName() + " is playing " + song.getName() +
                " making " + getDrumset().play());
    }

    public Drumset getDrumset() {
        return drumset;
    }
}
