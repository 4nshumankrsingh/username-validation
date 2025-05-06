import java.util.Scanner;
public class usernameSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 16) {
            System.out.println("Username must be between 4 to 16 characters");
        }
        else if (username.contains("-") || username.contains(" ")) {
            System.out.println("Username can't contain '-' and space");
        }
        else {
            System.out.printf("Welcome %s", username);
        }

        scanner.close();

    }
}