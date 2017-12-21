package music;

public abstract class Guitarist {
    private Guitar guitar = new Guitar();

    abstract public void play(Song song);

    public Guitar getGuitar() {
        return guitar;
    }
}
