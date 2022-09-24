
package all_Pactice;

class Student4{
    String name = "Jahid";
    int roll = 4585;
}
class Result4 extends Student4{
    float mark = 45.5f;
    String Program = "CSE";
}
public class Super_SubClass {
    public static void main(String[] args) {
        Result4 R = new Result4();
        System.out.println("My name is: "+R.name);
        System.out.println("Roll no: "+R.roll);
        System.out.println("Program: "+R.Program);
        System.out.println("Marks: "+R.mark);
    }
}
