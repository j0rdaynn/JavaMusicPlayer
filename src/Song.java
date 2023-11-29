public class Song {
    private String name;
    private float length;
    private String artist;

    public Song(String songTitle, String songArtist, float songLength) {
        name = songTitle;
        artist = songArtist;
        length = songLength;
    }

    public String getName() {
        return name;
    }

    public float getLength() {
        return length;
    }

    public String getArtist() {
        return artist;
    }
}
