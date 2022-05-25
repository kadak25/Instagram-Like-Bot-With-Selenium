import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter your username :");
        String username = scanner.nextLine();

        System.out.println("Please enter your password :");
        String password = scanner.nextLine();

        System.out.println("Please enter your target username :");
        String profileName = scanner.nextLine();


        InstagramApp app = new InstagramApp();
        app.loginWith(username, password);
        app.moveToProfile(profileName);
        app.clickFirstPost();
        app.likeAllPosts();
    }


}
