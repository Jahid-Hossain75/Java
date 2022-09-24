
package all_Pactice;

class Number{
    private double num1, num2;
    public Number (double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    Number(Number copy){
        System.out.println("Copy constructor called");
        num1 = copy.num1;
        num2 = copy.num2;
    }
    @Override
    public String toString(){
        return "(" + num1 + " + " + num2 + " i)";
    }
}

public class Copy_constructor {
    public static void main(String[] args) {
        Number object1 = new Number(5, 60);
        Number object2 = new Number(object1);
        Number object3 = object2;
        System.out.println(object2);
    }
}
