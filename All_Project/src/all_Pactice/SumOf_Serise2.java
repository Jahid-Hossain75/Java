
package all_Pactice;

import java.util.Scanner;

public class SumOf_Serise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int i = 0, sum=0;
        while(i<=n){
            sum+=i;
            i+=2;
        }
        System.out.println("The sum of the series = "+sum);
    }
}
