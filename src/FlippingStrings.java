public class FlippingStrings {

    public static void main(String[] args) {
        String string = "The cat is walking backwards";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        //write your code here
        StringBuilder stringBuilder = new StringBuilder(string);
       return stringBuilder.reverse().toString();
    }

}
