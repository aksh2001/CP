package A;
import java.util.Arrays;
import java.util.Scanner;

public class FashionableValera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int[] input= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();

        Arrays.sort(input);

        int count = 0;

        for(int i=0;i<input.length-1;i++){

            if(input[i]==input[i+1]) count++;
        }
        System.out.println(count);
        sc.close();



    }
    
}
