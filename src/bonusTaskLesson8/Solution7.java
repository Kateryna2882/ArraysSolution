package bonusTaskLesson8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
GCD

*/
public class Solution7 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String input1 = reader.readLine();
            String input2 = reader.readLine();

            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);
            if (num1 <= 0 || num2 <= 0) {
                throw new IllegalArgumentException("Both numbers must be positive integers!");
            }
            int gcd = findGCD(num1, num2);

            // 4. Вивід результату
            System.out.println("GCD = " + gcd);

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input! Please enter positive integers only.");
        }
    }

    // Метод для обчислення НСД
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
