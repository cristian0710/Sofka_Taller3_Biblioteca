import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<Song> songs = new ArrayList<Song>();
        Song cancion = new Song();
        Song cancion2 = new Song();
        Date var = new Date();

            cancion.setName("Tanto amor");
            cancion.setDate("2005-07-10");
            cancion.setDuration(180);
            songs.add(cancion);
            System.out.println(songs.get(0).getName()+"\n"+songs.get(0).getDate());
            cancion2.setName("Tanto  2");
            cancion2.setDate("20010-07-25");
            cancion2.setDuration(120);
            songs.add(cancion2);
            System.out.println(songs.get(1).getName()+"\n"+songs.get(1).getDate());

            cancion.setName("Tanto amor 3");
            cancion.setDate("2000-12-10");
            cancion.setDuration(130);

        for (Song lista: songs){
            System.out.println(lista);
        }
        for (int i=0; i< songs.size(); i++){
            System.out.println(songs.get(i).getDate());
        }*/

        Playlist lista1 = new Playlist("favorita");
        ArrayList<Song> orderList = new ArrayList<Song>();
        Library allCancion = new Library();
        Song cancion1 = new Song();
        Song cancion2 = new Song();
        Song cancion3 = new Song();

        cancion1.setName("Tanto amor");
        cancion1.setDate("2005-07-10");
        cancion1.setDuration(180);
        cancion1.setGenre("Salsa");
        cancion2.setName("Sandra Mora");
        cancion2.setDate("2010-07-25");
        cancion2.setDuration(120);
        cancion3.setName("El berracoski");
        cancion3.setDate("1988-12-24");
        cancion3.setDuration(200);
        cancion3.setGenre("Salsa");
        lista1.addSong(cancion1);
        lista1.addSong(cancion2);
        lista1.addSong(cancion3);
        allCancion.setAllSongs(cancion1);
        allCancion.setAllSongs(cancion2);
        allCancion.setAllSongs(cancion3);
        orderList.add(cancion1);
        orderList.add(cancion2);
        orderList.add(cancion3);

        allCancion.genero("Salsa");
        allCancion.date("2010-07-25");
        System.out.println(allCancion.getSearchGen());
        System.out.println(allCancion.getSearchDate());
        System.out.println(allCancion.getAllSongs().size());
        Collections.sort(orderList);

        for (Song order: orderList){
            System.out.println(order);
        }

    }

}
