
package all_Pactice;

import java.util.Scanner;

public class EvenOdd_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Enter the any number: ");
        num = input.nextInt();
        
        if(num%2==0){
            System.out.println(num+ " is Even number");
        }else{
            System.out.println(num+ " is Odd number");
        }
    }
}
