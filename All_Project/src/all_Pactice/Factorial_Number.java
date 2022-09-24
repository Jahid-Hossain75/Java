
package all_Pactice;

import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+ " = "+fact);
    }
}
