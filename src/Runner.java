import java.util.InputMismatchException;
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
        System.out.println("Welcome! This is your own playlist maker.\nYou can choose to make a song and then add it to your playlist.\n---------------------------------------------");
        int firstChoice = start();
        if (firstChoice == 3){ //exits program
            System.exit(0);
        }
        else if (firstChoice == 2){ //wants to modify a song
            System.out.println("Test2");
        }
        else if (firstChoice == 1){ //wants to modify a playlist
            System.out.println("Test1");
        }
        //END OF PROGRAM
    }

    public static int start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to:\n1.modify a playlist\n2.modify a song\n3.end program");
        int finalAction=0;
        try {
            int action = scan.nextInt();
            finalAction = action;
            if (action != 1 && action != 2 && action != 3) {
                System.out.println("---------------------------------------------\nPlease type a valid number.\n---------------------------------------------");
                start();
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("---------------------------------------------\nSomething went wrong. Please type the number of the option you wish to choose.\n---------------------------------------------");
            start();
        }
        return finalAction;
    }
}
