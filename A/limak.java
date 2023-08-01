package A;
import java.util.Scanner;

public class limak {

    int IamBigger(int a, int b){

        if(a ==b) return 1;
        int i =0;
        while(true){
            
            if(Math.pow(1.5, i)>(double)b/a) return i;
            
            i++;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        limak obLimak = new limak();

        String[] input = sc.nextLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

       System.out.println( obLimak.IamBigger(a, b));
       sc.close();
    }
    
}
