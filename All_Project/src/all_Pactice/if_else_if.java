
package all_Pactice;

import java.util.Scanner;

public class if_else_if {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Enter the value: ");
        num = input.nextInt();
        
        if(num>5){
            System.out.println("Positive");
        }else if(num<5){
            System.out.println("Negative");
        }else{
            System.out.println("Equal");
        }
    }
}
