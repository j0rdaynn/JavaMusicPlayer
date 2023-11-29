import java.util.List;

public class Playlist {
    private String name;
    private SongList songList;

    public Playlist(String playlistName) {
        name = playlistName;
        songList = new SongList();
    }

    public void addSongToPlaylist(Song song) {
        songList.addSong(song);
    }

    public List<Song> getPlaylist() {
        return songList.getSongs();
    }
}
