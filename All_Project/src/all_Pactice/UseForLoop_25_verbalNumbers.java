
package all_Pactice;

import java.util.Scanner;

public class UseForLoop_25_verbalNumbers {
    public static void main(String[] args) {
        int i,j;
        System.out.println("Series of Prime number upto 25 is:");
        for (i = 2; i <= 25; i++) {
            for (j = 2; j <=i; j++) {
                if (i%j==0)
                    break;
            }
            if (i==j)
                System.out.print(" "+i+" ");
        }
    }
}
