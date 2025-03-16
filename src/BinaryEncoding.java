public class BinaryEncoding {




    public static void main(String[] args) {
        String string = "CodeGym!";
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            print(charArray[i]);
        }
    }

    private static void print(int number) {
        String result = String.format("In Unicode, the character %s is %d, but in binary it is %s", (char) number, number, toBinary(number));
        System.out.println(result);
    }

    public static String toBinary(int number) {
        String result = "";
        while (number != 0) {
            result = number % 2 + result;
            number /= 2;
        }
        return result;
    }
}


