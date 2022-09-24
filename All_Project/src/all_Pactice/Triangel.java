
package all_Pactice;

import java.util.Scanner;

public class Triangel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base: ");
        double base = input.nextDouble();
        
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        
        double area = 0.5 * base * height;
        System.out.println("Triangle: "+area);
    }
}
