
package all_Pactice;

public class Polymorphism {
    void demo (int a){
        System.out.println("A: "+a);
    }
    void demo (int a, int b){
        System.out.println("A and B: "+a+ ","+b);
    }
    double demo(double a){
        System.out.println("Double A: "+a);
        return a*a;
    }
    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        double result;
        obj.demo(10);
        obj.demo(10, 20);
        result = obj.demo(5.5);
        System.out.println("O/P: "+result);
    }
}
