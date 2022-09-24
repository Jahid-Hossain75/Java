
package all_Pactice;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the a: ");
        double a = input.nextInt();
        
        double Area = a*a;
        System.out.println("Square: "+Area);
    }
}
