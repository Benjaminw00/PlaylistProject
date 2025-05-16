import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Song m = new Song("Test1", "test", "test", 5);
        Song n = new Song("Test2", "test1", "test", 10);
        Playlist g = new Playlist("Tester Playlist", m);
        g.addSong(n);
        g.getList();
        g.organizeGenre("test");
        g.getList();
    }
}
