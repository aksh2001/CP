import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int temp = (input[0]>input[1])?input[0]:input[1];
        if(temp==1) System.out.println(1+"/"+1);
        else if(temp==2) System.out.println(5+"/"+6);
        else if(temp==3) System.out.println(2+"/"+3);
        else if(temp==4) System.out.println(1+"/"+2);
        else if(temp==5) System.out.println(1+"/"+3);
        else System.out.println(1+"/"+6);
 
    }
    
}
