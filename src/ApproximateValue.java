public class ApproximateValue {

    public static void main(String[] args) {
        int big = 1234567890;

        System.out.println(getDifference(big)); // 46 or -46
    }

    public static int getDifference(int big) {
        float approx = big;

        //write your code here
        return big - (int) approx;
    }

}
