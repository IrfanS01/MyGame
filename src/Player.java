import java.util.Scanner;

public class Player {

    public static String enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        return name;
    }


    }
