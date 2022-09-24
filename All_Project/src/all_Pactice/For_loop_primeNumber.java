
package all_Pactice;

public class For_loop_primeNumber {
    public static void main(String[] args) {
        int i= 0;
        int j=0;
        String primeNumber = "";
        for(i=1; i<=100; i++){
            int counter = 0;
            for(j=i; j>=1; j--){
                if(i%j==0){
                    counter++;
                }
            }
            if(counter == 2){
                primeNumber = primeNumber + i + ", ";
            }
        }
        System.out.println(primeNumber);
    }
}
