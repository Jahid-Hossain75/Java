
package all_Pactice;

import java.util.Scanner;

class student{
    int roll;
    String name;
    float mark;
    
    public student(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Roll no: ");
        roll = input.nextInt();
        System.out.println("Enter your Name: ");
        name = input.nextLine();
        System.out.print("Enter your mark: ");
        mark = input.nextFloat();
        
        System.out.println("Roll is: "+roll);
        System.out.println("Name is: "+name);
        System.out.println("Mark is: "+mark);
    }
}
public class Constructor_Method {
    public static void main(String[] args) {
        student s = new student();
    }
}
