
package all_Pactice;

import java.util.Scanner;

public class SumOf_Serics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("Enter N value: ");
        num = input.nextInt();
        for(int i=1; i<=num; i= i+2) {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
}
