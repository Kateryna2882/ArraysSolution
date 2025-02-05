package methods;

import java.util.Scanner;

public class EmotionDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int emotionNumber = scanner.nextInt();
switch (emotionNumber){
    case 1:
        System.out.println("You are happy");
        break;
    case 2:
        System.out.println("You are said");
        break;
    case 3:
        System.out.println("You are angry");
        break;
    case 4:
        System.out.println("You are surprised");
        break;
    default:
        System.out.println("Unknown emotion");
}
    }
}
