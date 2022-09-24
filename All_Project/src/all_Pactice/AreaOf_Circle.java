
package all_Pactice;

import java.util.Scanner;

public class AreaOf_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        
        double area = (3.1416*radius*radius);
        System.out.println("Circle Area: "+area);
    }
}
