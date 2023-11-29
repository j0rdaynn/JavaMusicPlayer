import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GUI {
    private MusicLibrary musicLibrary;
    private JLabel songInfoLabel;

    public GUI() {
        musicLibrary = new MusicLibrary();
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Music Player");

        JButton playButton = new JButton("Play");
        JButton nextButton = new JButton("Next");

        songInfoLabel = new JLabel("No song playing");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(325, 325, 200, 300));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(playButton);
        panel.add(nextButton);
        panel.add(songInfoLabel);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        playButton.addActionListener(e -> playButtonClicked());
        nextButton.addActionListener(e -> nextButtonClicked());
        //got help on this part, refused to work at first lol
    }

    private void playButtonClicked() {

        List<Song> playlistSongs = getCurrentlyPlayingPlaylist();
        if (!playlistSongs.isEmpty()) {
            Song currentSong = playlistSongs.get(0);
            updateSongInfoLabel(currentSong);
        } else {
            songInfoLabel.setText("No song playing");
        }
    }

    private void nextButtonClicked() {

        List<Song> playlistSongs = getCurrentlyPlayingPlaylist();
        if (!playlistSongs.isEmpty()) {

            Song currentSong = playlistSongs.get(0);
            updateSongInfoLabel(currentSong);
        } else {
            songInfoLabel.setText("No song playing");
        }
    }

    private List<Song> getCurrentlyPlayingPlaylist() {

        List<Playlist> playlists = musicLibrary.getPlaylists();
        if (!playlists.isEmpty()) {
            Playlist firstPlaylist = playlists.get(0);
            return firstPlaylist.getPlaylist();
        } else {
            return List.of();
        }
    }

    private void updateSongInfoLabel(Song song) {

        String songInfo = "Name: " + song.getName() + ", Artist: " + song.getArtist() + ", Length: " + song.getLength();
        songInfoLabel.setText(songInfo);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUI());
    }
}


