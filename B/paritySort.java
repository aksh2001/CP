import java.util.Arrays;
import java.util.Scanner;

public class paritySort {
    boolean isSortable(int[] a){

        boolean[] evenOdd = new boolean[a.length];


        for(int i=0; i<a.length;i++){
            if(a[i]%2 ==0) evenOdd[i] = true;
            else evenOdd[i] =false;
        }
        // Arrange all even integers
        //Use Some Sorting 
        // Arrange all odd integers
        //Use Some Sorting
        
        //Arrange all the array
        //if both the individually sorted array and even odd sorted array are equal then return true else return false
         

        return false;
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        paritySort ob = new paritySort();
        int testcases = Integer.parseInt(sc.nextLine());
        boolean[] result = new boolean[testcases];
        while(testcases!=0){
            sc.nextLine();
            int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            result[result.length-testcases] = ob.isSortable(a);

            
            testcases--;
        }
        for(int i=0; i<testcases;i++){
            if(result[i]) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
    
}
