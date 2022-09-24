package all_Pactice;

import java.util.Scanner;

public class Input_and_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the seconed number: ");
        int num2 = input.nextInt();
        
        int result = num1 + num2;
        System.out.println("Result Sum: "+result);
        
        
//        int number1 = 22;
//        int number2 = 18;
//        int result2 = number1 + number2;
//        System.out.println("REsult: "+ result2);
    }
}
