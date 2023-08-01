import java.util.Arrays;
import java.util.Scanner;

public class Carrotcakes {
    
    int calcarrots(int n, int t, int k, int d){
        
        if(n%k==0) return (n/k)*t;
        else return (n/k +1)*t;
    }
    int calcarrotsWithNewOven(int n, int t, int k, int d){
        int i=1;
        int j=1;
        int l =1;
        int carrots = 0;
        while(true){
            
            if(i==d+j*t){carrots += k;
            j++;
            }
            
            if( i==l*t) {
                carrots += k;
                l++;
            }
            if(carrots >= n) return i;
            i++;
        

        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrotcakes ob = new Carrotcakes();

        int[] arr =Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];
        int t = arr[1];
        int k = arr[2];
        int d = arr[3];
        
        
        String call = (ob.calcarrotsWithNewOven(n, t, k, d)<ob.calcarrots(n, t, k, d))? "YES":"NO";
        System.out.println(call);
        // System.out.println(ob.calcarrots(n, t, k, d));
        // System.out.println(ob.calcarrotsWithNewOven(n, t, k, d)
       
        sc.close();
    }
}
