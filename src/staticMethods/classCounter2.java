package staticMethods;

public class classCounter2 {

    private static int catCount = 0;

    public classCounter2() {
        catCount++;
    }

    public static int getCatCount() {
        //write your code here
        return catCount;

    }

    public static void setCatCount(int catCount) {
        //write your code here
        classCounter2.catCount = catCount;

    }

    public static void main(String[] args) {

    }

}
