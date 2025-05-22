import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        //Start of actual program
        ArrayList<Playlist> playlists = new ArrayList<Playlist>(); //generates the list of playlists
        ArrayList<Song> songs = new ArrayList<Song>(); //generates the list of songs

        System.out.println("---------------------------------------------\nWelcome! This is your own playlist maker.\nYou can choose to make a song and then add it to your playlist.\n---------------------------------------------");
        int firstChoice = start();
        while (firstChoice != 3) {
            if (firstChoice == 2) { //wants to modify a song
                int secondChoice = modifySong();
                if (secondChoice == 1) { //creates a song
                    Song createdSong = makeSong();
                    System.out.println("---------------------------------------------\n"+ createdSong.toString() +"\n---------------------------------------------");
                    songs.add(createdSong);
                } else if (secondChoice == 2) {//wants an already made song
                    Song pregeneratedSong = new Song();
                    System.out.println(pregeneratedSong);
                } else if (secondChoice == 3) { //exits program
                    System.exit(0);
                }
            } else if (firstChoice == 1) { //wants to modify a playlist
                int secondChoice = modifyList();
                if (secondChoice == 1) { //create new playlist
                    playlists.add(makePlaylist());
                    System.out.println("---------------------------------------------\nA playlist named " + playlists.getLast().getListName() + " has successfully been added.\n---------------------------------------------");
                } else if (secondChoice == 2) {//view current playlists
                    System.out.println("---------------------------------------------");
                    System.out.print("The names of the current playlists: ");
                    for (Playlist i : playlists) {
                        System.out.print(i.getListName() + ", ");
                    }
                    System.out.println("\n---------------------------------------------");
                } else if (secondChoice == 3) { //exits program
                    System.exit(0);
                }
            }
            firstChoice = start();
        }
        System.exit(0); //user typed 3
        //END OF PROGRAM
    }

    public static int start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to:\n1.modify a playlist\n2.modify a song\n3.end program");
        int finalAction=0;
        try {
            int action = scan.nextInt();
            if (action != 1 && action != 2 && action != 3) {
                System.out.println("---------------------------------------------\nPlease type a valid number.\n---------------------------------------------");
                finalAction = start();
            }
            else {
                finalAction = action;
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("---------------------------------------------\nSomething went wrong. Please type the number of the option you wish to choose.\n---------------------------------------------");
            finalAction = start();
        }
        return finalAction;
    }

    public static int modifySong(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What you like to:\n1.create a song manually\n2.get an already generated song\n3.end program");
        int finalAction = 0;
        try {
            int action = scan.nextInt();
            if (action!=1 && action!=2 && action!=3) {
                System.out.println("---------------------------------------------\nPlease type a valid number.\n---------------------------------------------");
                finalAction = modifySong();
            }
            else {
                finalAction=action;
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("---------------------------------------------\nSomething went wrong. Please type the number of the option you wish to choose.\n---------------------------------------------");
            finalAction=modifySong();
        }
        return finalAction;
    }

    public static int modifyList(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What you like to:\n1.create new playlist\n2.view current playlists\n3.end program");
        int finalAction = 0;
        try {
            int action = scan.nextInt();
            if (action!=1 && action!=2 && action!=3) {
                System.out.println("---------------------------------------------\nPlease type a valid number.\n---------------------------------------------");
                finalAction = modifyList();
            }
            else {
                finalAction=action;
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("---------------------------------------------\nSomething went wrong. Please type the number of the option you wish to choose.\n---------------------------------------------");
            finalAction=modifyList();
        }
        return finalAction;
    }

    public static Song makeSong(){
        Scanner scan = new Scanner(System.in);
        Song finalSong = new Song();
        System.out.println("What is the song's name?");
        finalSong.setName(scan.nextLine());
        System.out.println("What is the song's genre");
        finalSong.setGenre(scan.nextLine());
        System.out.println("Who is the artist?");
        finalSong.setArtist(scan.nextLine());
        System.out.println("How many streams does the song have?");
        finalSong.setStreams(scan.nextInt());

        return finalSong;
    }

    public static Playlist makePlaylist(){
        Scanner scan = new Scanner(System.in);
        Playlist playlist = new Playlist();
        System.out.println("What will be the name of this playlist?");
        playlist.setListName(scan.nextLine());
        return playlist;
    }
}
