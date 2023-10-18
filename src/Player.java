import java.util.Scanner;

public class Player {
    public String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 Enter your name:");
        String name = scanner.nextLine();
       return name;
    }

    public void enterMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your move: ");
        String move = scanner.nextLine();
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