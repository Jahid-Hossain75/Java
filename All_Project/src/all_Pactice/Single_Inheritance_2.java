
package all_Pactice;

import java.util.Scanner;
//filde and method of the parent class jahid
class jahid{
        String name, univercity, department;
        public void art(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your Full name: ");
            name = input.nextLine();
            System.out.print("Enter your Univercity name: ");
            univercity = input.nextLine();
            System.out.print("Enter your Department name: ");
            department = input.nextLine();
        }
    }
//sub Class bejoy and Extends jahid Class
    class bejoy extends jahid{
        int id, roll;
        public void mon(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your clloge ID no: ");
            id = input.nextInt();
            System.out.print("Enter your board Roll no: ");
            roll = input.nextInt();
        }
    }
//Main Class
public class Single_Inheritance_2 {
    public static void main(String[] args) {
        bejoy a = new bejoy();
        a.art();
        a.mon();
        System.out.println("");
        System.out.println("____________________________________________");
        System.out.println("My name is            : "+a.name);
        System.out.println("My Univercity name is : "+a.univercity);
        System.out.println("My Depatment is       : "+a.department);
        System.out.println("My Clloge Id No       : "+a.id);
        System.out.println("My Borad Roll No      : "+a.roll);
    }
}
