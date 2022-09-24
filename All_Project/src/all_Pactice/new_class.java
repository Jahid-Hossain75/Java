
package all_Pactice;

class Student{
    String name;
    int roll;
    float marks;
    
    public Student(){
        roll = 4345;
        name= "jahid";
        marks = 45.5f;
        
        System.out.println(name);
        System.out.println(roll);
        System.out.println(marks);
    }
}

public class new_class {
    public static void main(String[] args) {
        Student s = new Student();
    }
}


