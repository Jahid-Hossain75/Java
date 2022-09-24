
package all_Pactice;

class Student2{
    int Roll;
    String Name;
}
class Result extends Student2{
    float Mark;
    void GetData(){
        Roll = 434533;
        Name = "Emamul";
        Mark = 60.75f;
    }
    void Display(){
        System.out.println("Roll is: "+Roll);
        System.out.println("Name is: "+Name);
        System.out.println("Mark is: "+Mark);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Result R = new Result();
        R.GetData();
        R.Display();
    }
}
