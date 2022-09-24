
package all_Pactice;

import java.util.Scanner;

public class Class_Object {
    String name, univercity, dept, gender;
    int id;
    public static void main(String[] args) {
        Class_Object t;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        t.name = input.nextLine();
        System.out.print("Enter your Univercity name: ");
        t.univercity = input.nextLine();
        System.out.print("Enter your Department: ");
        t.dept = input.nextLine();
        System.out.print("Enter your gender: ");
        t.gender = input.nextLine();
        System.out.print("Enter your Id no: ");
        t.id = input.nextInt();
        
        System.out.println();
        System.out.println("-------------------------------");
        
        System.out.println("Name       : "+t.name);
        System.out.println("Univercity : "+t.univercity);
        System.out.println("Department : "+t.dept);
        System.out.println("Gender     : "+t.gender);
        System.out.println("ID         : "+t.id);
    }
}
