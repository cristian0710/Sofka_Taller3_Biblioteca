import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Playlist {

    private List<Song> songs;
    private String name;

    public Playlist( String name) {
        this.songs = new ArrayList<>();
        this.name = name;
    }


    public void addSongs(Song song){

        songs.add(song);
    }


    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}