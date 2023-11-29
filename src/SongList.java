import java.util.ArrayList;
import java.util.List;

public class SongList {
    private List<Song> songs;

    public SongList() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }
}
