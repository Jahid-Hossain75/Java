
package all_Pactice;

interface Student_{
    static final int Roll = 434533;
    static final String Name = "Emamul";
    void Display();
}
class Result_ implements Student_{
    public float Mark;
    @Override
    public void Display(){
        System.out.println("Roll is: "+Roll);
        System.out.println("Name is: "+Name);
    }
    public void GetMark(){
        Mark = 95.45f;
    }
    public void ShowMark(){
        System.out.println("Mark is: "+Mark);
    }
}
public class Execute_Interface {
    public static void main(String[] args) {
        Result_ R = new Result_();
        R.Display();
        R.GetMark();
        R.ShowMark();
    }
}
