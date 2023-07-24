import java.util.Arrays;
import java.util.Scanner;

public class gravity {

    String arrange(int column, int[] arr){

        Arrays.sort(arr);
        String output="";
        for(int i=0; i<column;i++){
            output +=arr[i]+" "; 
        }
        output.trim();
        return output;

    }

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);

        gravity ob = new gravity();

        int cols = Integer.parseInt(sc.nextLine());

        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[cols];

        for(int i=0; i<cols;i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println(ob.arrange(cols, arr));
        sc.close();
    }
    
}
