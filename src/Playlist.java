import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs = new ArrayList<>();
    private String name;

    public Playlist(String name) {
        this.songs = songs;
        this.name = name;
    }

    public void addSong (Song song){
        this.songs.add(song);
    }


    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name +
                ", songs=" + songs + '\'' +
                '}';
    }
}
