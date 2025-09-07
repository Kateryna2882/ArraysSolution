package typeCasting;

import static java.sql.DriverManager.println;

/*
Bridges

*/
public class SolutionBridges {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    // Add println method here

    public static void println(Bridge waterBridge) {
        System.out.println(waterBridge.getCarsCount());
    }

}

