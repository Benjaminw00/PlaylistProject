import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //TESTING
        /*
        Song m = new Song("Test1", "test", "test", 5);
        Song n = new Song("Test2", "test1", "test", 10);
        Playlist g = new Playlist("Tester Playlist", m);
        g.addSong(n);
        g.getList();
        g.organizeGenre("test");
        g.getList(); */
        //END OF TESTS

        //Start of actual program (include scanner and try catches)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! This is your own playlist maker.\nYou can choose to make a song and then add it to your playlist.\n---------------------------------------------");
        System.out.println("Would you like to:\n1.modify a list\n2.modify a song");
        String initialAction = scanner.nextLine();
        if (!initialAction.equals("modify a list") && !initialAction.equals("modify a song")){
            throw new IllegalArgumentException("choose one of the choices given in all lower case and include the spaces");
        }

        //END OF PROGRAM
    }
}
