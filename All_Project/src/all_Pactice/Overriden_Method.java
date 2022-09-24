package all_Pactice;

class Superclass{
    int n;
    Superclass(){
        n++;
    }
    public void GetData(){
        System.out.println("It is Superclass");
        System.out.println("n="+n);
    }
}
class Subclass extends Superclass{
    int n;
    Subclass(){
        n++;
    }
    public void GetData(){
        System.out.println("It is Subclass");
        System.out.println("n="+n);
    }
}

public class Overriden_Method {
    public static void main(String[] args) {
        Superclass sp = new Subclass();
        sp.GetData();
        Subclass sb = new Subclass();
        sb.GetData();
    }
}
