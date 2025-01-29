package methods;

public class FavoriteDish {


    public static void main(String[] args) {
        String firstName = "Olivia";
        String lastName = "Klinger";
        String favoriteDish = "Spaghetti";
        printPersonInfo(firstName, lastName, favoriteDish);

    }

    public static void printPersonInfo(String name, String surname, String mel) {
        System.out.println("Short dossier:");
        System.out.println("First name: " + name);
        System.out.println("Last name: " + surname);
        System.out.println("Favorite dish: " + mel);


    }
}
