import java.util.ArrayList;


public class Playlist {
    private String listName;
    private ArrayList<Song> list = new ArrayList<Song>();

    //CONSTRUCTORS
    public Playlist(String name){ //constructor where list is empty
        this.listName = name;
    }


    public Playlist(String name, Song firstSong){ //constructor where one song
        this.listName = name;                     //can be added initially to list
        list.add(firstSong);
    }

    public Playlist(){}
    //END OF CONSTRUCTORS

    //METHODS
    public void getList(){
        System.out.print("The playlist, " + getListName() + ", has the current songs: [");
        for (int i = 0; i < list.size()-1; i++){
            System.out.print(list.get(i).getName()+ ", ");
        }
        System.out.println(list.getLast().getName() + "]");
    }

    public void addSong(Song toBeAdded){
        list.add(toBeAdded);
    }

    public void organizeGenre(String genre){ //sorts a list to only contain one specific genre
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).getGenre()!=genre){
                list.remove(i);
            }
        }
    }
    //END OF METHODS


    //GETTERS & SETTERS
    public String getListName() {
        return listName;
    }


    public void setListName(String listName) {
        this.listName = listName;
    }
    //END OF GETTERS & SETTERS
}
