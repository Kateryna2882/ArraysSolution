public class SolutionText {

    public static void main(String[] args) {
        String numberStr = "147852369";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String digitToText(char digit) {
        String result = "";
        switch (digit) {
            case '0':
                result = "zero";
                break;
            case '1':
                result = "one";
                break;
            case '2':
                result = "two";
                break;
            case '3':
                result = "three";
                break;
            case '4':
                result = "four";
                break;
            case '5':
                result = "five";
                break;
            case '6':
                result = "six";
                break;
            case '7':
                result = "seven";
                break;
            case '8':
                result = "eight";
                break;
            case '9':
                result = "nine";
                break;
        }
        return result;
    }
}