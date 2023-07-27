package A;

import java.util.Arrays;
import java.util.Scanner;

public class scrooge {
    double coordinateDistance(int x1, int x2, int y1, int y2){

        return Math.pow(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2),0.5);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        scrooge ob = new scrooge();
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int points = input[0];

        int[] x = new int[points];
        int[] y = new int[points];
        while(points!=0){
            int[] arr =Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            x[x.length-points]= arr[0];
            y[y.length-points]= arr[1];
            
            points--;
        }
        double strokeLength =0;
        for(int i=0; i<x.length-1;i++){
            strokeLength +=ob.coordinateDistance(x[i], x[i+1], y[i], y[i+1]);
        }
        System.out.println(strokeLength/50*input[1]);
        sc.close();
    }
    
}
