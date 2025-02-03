package methods;

import java.util.Scanner;

public class CarSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        if(price <= 12000){
            System.out.println("enough");
        } else {
            System.out.println(" no enough");
        }
    }
}
