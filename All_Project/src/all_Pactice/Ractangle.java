
package all_Pactice;

import java.util.Scanner;

public class Ractangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the width: ");
        double width = input.nextInt();
        
        System.out.print("Enter the height: ");
        double height = input.nextInt();
        
        double Area = width * height;
        System.out.println("Ractangle: "+Area);
    }
}
