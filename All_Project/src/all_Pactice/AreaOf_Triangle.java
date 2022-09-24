
package all_Pactice;

import java.util.Scanner;

public class AreaOf_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter hight of the triangle: ");
        double hight = input.nextDouble();
        double area = 3.1416*base*hight;
        System.out.println("Triangle Area: "+area);
    }
}
