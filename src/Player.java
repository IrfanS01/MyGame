import java.util.Scanner;

public class Player {

    public static String enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        return name;
    }
    public void HowToPlay(){
        System.out.println("You play the game by typing X in the free space from 1-9.Good luck:");
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("           ");
    }


    }





