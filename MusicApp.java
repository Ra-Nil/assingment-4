class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public void play() {
        System.out.println("Playing song.");
    }
}

class PopSong extends Song {
    public PopSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Playing Pop Song: " + getTitle() + " by " + getArtist());
    }
}

class RockSong extends Song {
    public RockSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Playing Rock Song: " + getTitle() + " by " + getArtist());
    }
}

class JazzSong extends Song {
    public JazzSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Playing Jazz Song: " + getTitle() + " by " + getArtist());
    }
}

public class MusicApp {
    public static void main(String[] args) {
        Song[] playlist = {
            new PopSong("Shape of You", "Ed Sheeran"),
            new RockSong("Numb", "Linkin Park"),
            new JazzSong("Blue in Green", "Miles Davis")
        };

        for (Song song : playlist) {
            song.play();
        }
    }
}