
package all_Pactice;

public class Class_Object_Job {
    private int Roll;
    private String Name;
    private float Mark;
    private void GetData(){
        Roll = 434533;
        Name = "Emamul";
        Mark = 55.25f;
    }
    void Display(){
        GetData();
        System.out.println("Roll is: "+Roll);
        System.out.println("Name is: "+Name);
        System.out.println("Mark is: "+Mark);
    }
    public static void main(String[] args) {
        Class_Object_Job s = new Class_Object_Job(); //Object declare
        s.Display();
    }
}
