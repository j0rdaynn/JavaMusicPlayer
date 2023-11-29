import java.util.List;

public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Song 1", "Artist 1", 3.5f);
        Song song2 = new Song("Song 2", "Artist 2", 4.2f);
        Song song3 = new Song("Song 3", "Artist 3", 5.3f);


        Playlist myPlaylist = new Playlist("My Playlist");


        myPlaylist.addSongToPlaylist(song1);
        myPlaylist.addSongToPlaylist(song2);
        myPlaylist.addSongToPlaylist(song3);


        List<Song> playlistSongs = myPlaylist.getPlaylist();
        for (Song song : playlistSongs) {
            System.out.println("Name: " + song.getName() + ", Artist: " + song.getArtist() + ", Length: " + song.getLength());
        }
    }
}
