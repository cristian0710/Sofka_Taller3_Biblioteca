public class Song implements Comparable<Song>{
    private String name;
    private String identifier;
    private String date;
    private int duration;
    private String genre;
    private String cover;
    private String description;

    public Song(String name, String identifier, String date, int duration, String genre, String cover, String description) {
        this.name = name;
        this.identifier = identifier;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }

    public Song (){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", identifier='" + identifier + '\'' +
                ", date='" + date + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", cover='" + cover + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(Song o) {
        return date.compareTo(o.getDate());
    }

}
