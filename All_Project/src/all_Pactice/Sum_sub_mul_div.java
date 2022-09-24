
package all_Pactice;

import java.util.Scanner;

public class Sum_sub_mul_div {
    public static void main(String[] args) {
        Scanner min = new Scanner(System.in);
        int num1, num2, addition, subtraction, multiplecation, division;
        
        System.out.print("Enter the first number: ");
        num1 = min.nextInt();
        System.out.print("Enter the second number: ");
        num2 = min.nextInt();
//        Addition = num1 + num2
        addition = num1 + num2;
        System.out.println("Addition: "+addition);
//        Subtraction = num1 - num2
        subtraction = num1 - num2;
        System.out.println("Subtraction: "+subtraction);
//        Multiplecation = num1 * num2
        multiplecation = num1 * num2;
        System.out.println("Multiplecation: "+multiplecation);
//        Division num1 /num2
        division = num1 /num2;
        System.out.println("Divition: "+division);
    }
}
