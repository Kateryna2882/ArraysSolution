public class Congratulations {

    public static String partyFace = "";
    public static String balloon = "";
    public static String gift = "";
    public static String partyPopper = "";
    public static String cake = "";

    public static void main(String[] args) {
        printCongratulation();
    }

    public static void printCongratulation() {
        String happyBirthday = "Happy birthday!";
        String congratulation = partyFace + balloon + partyPopper + cake + gift;
        System.out.println(happyBirthday + congratulation);
    }
}
