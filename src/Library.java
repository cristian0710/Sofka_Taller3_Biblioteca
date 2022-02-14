import java.util.*;

public class Library {
    private List<Song> allSongs = new ArrayList<Song>();
    private List searchGen = new ArrayList<>();
    private List searchDate = new ArrayList();

    public Library() {
    }

    public void setAllSongs(Song song){
        this.allSongs.add(song);
    }

    public List<Song> getAllSongs() {
        return allSongs;
    }

    public void genero(String genero){
        searchGen.clear();
        for(Song lista: allSongs){
            if(lista.getGenre() == genero){
                searchGen.add(lista);
            }
        }
    }



    public void date(String date){
        searchDate.clear();
        for (Song lista: allSongs){
            if (lista.getDate().equals(date)){
                searchDate.add(lista);
            }
        }
    }

    public List<Song> orderByDuration(){
        List<Song> newlist = allSongs;
        newlist.sort(Comparator.comparing(song -> song.getDuration()));
        return newlist;
    }

    public List<Song> orderByDate(){

        List<Song> newlist=allSongs;
        newlist.sort(Comparator.comparing(song ->song.getDate()));
        return newlist;
    }

    public List getSearchGen() {
        return searchGen;
    }

    public List getSearchDate() {
        return searchDate;
    }

    @Override
    public String toString() {
        return "Library{" +
                "allSongs=" + allSongs +
                '}';
    }




}
