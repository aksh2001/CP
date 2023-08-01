import java.util.Arrays;
import java.util.Scanner;

public class kolya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int b = input[1];
        int d = input[2];

        int[] oranges = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count =0;
        int orangesinJuicer = 0;

        for(int i=0;i<oranges.length;i++){
            if(oranges[i]<=b){
                orangesinJuicer += oranges[i];
                if(orangesinJuicer>d){
                    count++;
                    orangesinJuicer = 0;
                }
            }
        }
        System.out.println(count);
        sc.close();
        
    }
    
}
