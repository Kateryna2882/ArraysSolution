package twoDimensionalArrays;

/*
Triangular array
*/
public class TriangularArray {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        // Ініціалізуємо трикутний масив
//        for (int i = 0; i < result.length; i++) {
//            result[i] = new int[i + 1];
//        }
//        // Заповнюємо масив сумами індексів
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                result[i][j] = i + j;
//            }
//        }
//        // Виводимо масив на екран
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();

        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}




