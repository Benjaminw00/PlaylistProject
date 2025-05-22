public class  Song {
    private String name;
    private String genre;
    private String artist;
    private int streams;


    //CONSTRUCTORS
    public Song(String n, String g, String a, int s){
        this.name = n;
        this.genre = g;
        this.artist = a;
        this.streams = s;
    }

    public Song(){
        this.name = "Style";
        this.genre = "pop";
        this.artist = "Taylor Swift";
        this.streams = 341520518;
    }
    //END OF CONSTRUCTORS


    //METHODS
    public String toString(){
        return "This is a " + genre + " song called " + name + " by " + artist + ". It has " + streams + " streams.";
    }

    //END OF METHODS


    //GETTERS & SETTERS
    public String getName() {
        return name;
    }


    public String getGenre() {
        return genre;
    }


    public String getArtist() {
        return artist;
    }


    public int getStreams() {
        return streams;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }


    public void setArtist(String artist) {
        this.artist = artist;
    }


    public void setStreams(int streams) {
        this.streams = streams;
    }
    //END OF GETTERS & SETTERS
}
