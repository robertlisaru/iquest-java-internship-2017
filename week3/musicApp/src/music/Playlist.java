package music;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;

    public void addSong(Song song) {
        songs.add(song);
    }

    public Playlist() {
        songs = new ArrayList<>();
    }

    public List<Song> getSongs() {
        return songs;
    }
}
