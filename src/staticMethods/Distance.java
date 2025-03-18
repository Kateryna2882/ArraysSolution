package staticMethods;

public class Distance {

    public static double getDistance(int x1, int y1, int x2, int y2) {
        //write your code here

        int dx = x2 - x1;
        int dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {

    }
}
