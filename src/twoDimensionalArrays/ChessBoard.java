package twoDimensionalArrays;


import java.util.Scanner;

/*
Chess board
*/
public class ChessBoard {

    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        array = new char[number][number];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
