
package all_Pactice;

import java.util.Scanner;

public class UserInput_Prime_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int count = 0;
        
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                count++;
                break;
            }
        }
        if (count==0) {
            System.out.println(num+" is Prime Number");
        }else{
            System.out.println(num+" is Not Prime Number");
        }
    }
}
