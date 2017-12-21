package music;

public class Main {
    public static void main(String args[]) {
        Song song1 = new Song("Treceti batalioane romane Carpatii");

        Playlist playlist1 = new Playlist();

        playlist1.addSong(song1);

        MusicPlayer player1 = new CDPlayer();
        player1.addPlaylist(playlist1);
        player1.playAll();

        player1 = new IPod();
        player1.play(song1);

        Band band1 = new Band();
        band1.playLive(song1);
    }
}
