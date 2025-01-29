package methods;

public class WelcomeButNotEveryone {

    public static void main(String[] args) {
        signIn("user");
        signIn("username");
    }

    public static void signIn(String username) {
        //write your code here
        String user = "user";
        if (username.equals(user)) {
            return;

        }
        System.out.println("Welcome, " + username);
        System.out.println("We've really missed you, " + username);
    }
}


