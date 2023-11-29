import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
    private List<Playlist> playlists;

    public MusicLibrary() {
        playlists = new ArrayList<>();
    }

    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }
}

