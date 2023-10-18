import java.util.Scanner;

public class Player2 {
    public String name;
    public Player2 (String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }


    public static String enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 2 Enter your name:");
        String name = scanner.nextLine();
        return name;



    }
    public void enterMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your move: ");
        String move = scanner.nextLine();

}}