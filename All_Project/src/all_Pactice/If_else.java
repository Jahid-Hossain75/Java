
package all_Pactice;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the number: ");
        num = input.nextInt();
        
        if(num>5){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}
