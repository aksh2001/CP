import java.util.Arrays;

import java.util.Scanner;

public class Dalton{
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = Integer.parseInt(sc.nextLine());
        int [] soln = new int[testcase];

        while(testcase>0){
            int n = Integer.parseInt(sc.nextLine());
            int[] seats = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int count =0 ;
            for(int i=0; i<seats.length;i++){
                if(seats[i]==i+1) count++;
            }
            if(count%2==0) soln[soln.length-testcase] =count/2;
            else soln[soln.length-testcase] =(count-1)/2 +1;
              testcase--;
        }
        for(int i=0;i<soln.length;i++){
            System.out.println(soln[i]);
        }


        
        
        sc.close();
    }
}