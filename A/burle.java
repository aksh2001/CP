package A;
import java.util.Arrays;
import java.util.Scanner;

public class burle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int i=1;
        while(true){

            if((input[0]*i)%10==0) break;

            if((input[0]*i-input[1])%10==0) break;

            i++;
        }
        System.out.println(i);
        sc.close();
    }
    
}
