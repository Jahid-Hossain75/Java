
package all_Pactice;

import java.util.Scanner;

public class two_number_sum {
    public static void main(String[] args) {
        
        Scanner min = new Scanner(System.in);
        int num1, num2, addition;
        
        System.out.print("Enter the first number: ");
        num1 = min.nextInt();
        System.out.print("Enter the second number: ");
        num2 = min.nextInt();
//        Addition = num1 + num2
        addition = num1 + num2;
        System.out.println("Addition: "+addition);
    }
}
