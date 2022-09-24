
package all_Pactice;

import java.util.Scanner;
//filde and method of the parent class Employee
    class Employee{
        public int salary = 40000;
    }
//    Inherit Programmer class
    class Programmer extends Employee{
        public int bonous = 10000;
    }
    
public class Single_Inheritance {
    public static void main(String[] args) {
        int total;
//        carete object
        Programmer jahid = new Programmer();
        total = jahid.salary + jahid.bonous;
        System.out.println("Salary : "+jahid.salary);
        System.out.println("Bonous : "+jahid.bonous);
        System.out.println("Total  : "+total);
    }
}
