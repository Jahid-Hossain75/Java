
package all_Pactice;

public class Method_Overloading {
    static float add(float a, float b) {
        return a+b;
    }
    static int add(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Add a float number: "+Method_Overloading.add(5.2f, 4.8f));
        System.out.println("Add a Int number: "+Method_Overloading.add(5, 4));
    }
}