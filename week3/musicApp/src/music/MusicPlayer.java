package music;

import java.util.ArrayList;
import java.util.List;

public abstract class MusicPlayer {
    List<Playlist> playlists = new ArrayList<>();

    void playAll() {
        for (Playlist playlist : playlists) {
            for (Song song : playlist.getSongs()) {
                play(song);
            }
        }
    }

    void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    abstract void play(Song song);


}
