public class WordPalindrome {

    public static void main(String[] args) {
        String word = "Rotor";
        String answer = isPalindrome(word) ? "Yes" : "No";
        System.out.println("Is the word \"" + word + "\" a palindrome? " + answer);
    }

    public static boolean isPalindrome(String word) {
        //write your code here
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        return word.equalsIgnoreCase(stringBuilder.toString());
    }

}
