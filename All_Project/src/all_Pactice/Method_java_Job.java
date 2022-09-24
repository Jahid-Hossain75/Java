
package all_Pactice;

public class Method_java_Job {
    float Mark1, Mark2, Tutorial;
    float Total, GTotal;
    float GetMark(float M1, float M2){
        Mark1 = M1;
        Mark2 = M2;
        Total = Mark1 + Mark2;
        return(Total);
    }
    void Display(){
        Tutorial = 10;
        GTotal = Total + GetMark(40,75);
        System.out.println("Tutorial Mark is: "+Tutorial);
        System.out.println("Mark1 is: \t"+Mark1);
        System.out.println("Mark2 is: \t"+Mark2);
        System.out.println("Grand Total is: "+GTotal);
    }
    public static void main(String[] args) {
        Method_java_Job s = new Method_java_Job();
        s.Display();
    }

}
