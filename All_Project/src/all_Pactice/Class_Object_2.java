
package all_Pactice;

import all_Pactice.Class_Object;

public class Class_Object_2 {
    String name, univercity, dept, gender;
    int id;
    public static void main(String[] args) {
        Class_Object t;
        t = new Class_Object();
        t.name = "Md. Jahid Hossain";
        t.univercity = "DUET";
        t.dept = "CSE";
        t.gender = "Male";
        t.id = 434575;
        
        System.out.println("Name       : "+t.name);
        System.out.println("Univercity : "+t.univercity);
        System.out.println("Department : "+t.dept);
        System.out.println("Gender     : "+t.gender);
        System.out.println("ID         : "+t.id);
    }
}
