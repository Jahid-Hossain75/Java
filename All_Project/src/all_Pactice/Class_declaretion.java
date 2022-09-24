
package all_Pactice;

import All_Syntax.*;

public class Class_declaretion {
    private
            long roll;
            String Name;
            float marks;
    public
            void GetData(){
                roll = 4545;
                Name = "Jahid";
                marks = 45.5f;
            }
            void Display(){
                System.out.println("Roll is: "+roll);
                System.out.println("Name is: "+Name);
                System.out.println("Marks: "+marks);
            }
    public static void main(String[] args) {
        Class_declaretion s = new Class_declaretion();
        s.GetData();
        s.Display();
    }
}
