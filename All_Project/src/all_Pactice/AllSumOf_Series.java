
package all_Pactice;

import java.util.Scanner;

public class AllSumOf_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        1+2+3+4+....+n and sum
        int n, sum = 0;
        System.out.println("1+2+3+4+....+n");
        System.out.print("Enter N value: ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i+ ", ");
            sum = sum+i;
        }
        System.out.println();
        System.out.println("Sum: "+sum);
        System.out.println();
        
        
        
        
//        1+3+5+7+9+....+n
        int m;
        System.out.println("1+3+5+7+....+n");
        System.out.print("Enter N value: ");
        m = input.nextInt();
        
        for (int i = 1; i <= m; i=i+2) {
            System.out.print(i+ ", ");
        }
        System.out.println();
        System.out.println();
        
        
        
        
//        2+4+6+8+....+n
        int p;
        System.out.println("2+4+6+8+....+n");
        System.out.print("Enter N value: ");
        p = input.nextInt();
        
        for (int i = 2; i <= p; i=i+2) {
            System.out.print(i+ ", ");
        }
        System.out.println();
        System.out.println();
        
        
        
        
//        1.5+2.5+3.5+4.5+....+n
        double q;
        System.out.println("1.5+2.5+3.5+4.5+....+n");
        System.out.print("Enter N value: ");
        q = input.nextDouble();
        
        for (double i = 1.5; i <= q; i++) {
            System.out.print(i+ ", ");
        }
        System.out.println();
        System.out.println();
        
        
        
        
//        1^2+2^2+3^2+....+n
        int w;
        System.out.println("1^2+2^2+3^2+....+n");
        System.out.print("Enter N value: ");
        w = input.nextInt();
        
        for (int i = 1; i <= w; i++) {
            System.out.print(i+"x"+i+", ");
        }
        System.out.println();
        System.out.println();
        
    }
}
