

import java.util.Arrays;
import java.util.Scanner;

public class Monocarp {

    int tooMuchBread(int[] layers){
        return 2*(layers[1]+layers[2])+1;
    }
    int tooMuchFilling(int[] layers){
        return 2*layers[0]-1;
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Monocarp ob = new Monocarp();
        int testcase = Integer.parseInt(sc.nextLine());
        int [] soln = new int[testcase];

        while(testcase!=0){

            int [] filling = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                if(filling[0]-1>filling[1]+filling[2]) soln[soln.length-testcase]= ob.tooMuchBread(filling); 
                else soln[soln.length-testcase]=ob.tooMuchFilling(filling);
            
            
            testcase--;
        }
        for(int i=0; i<soln.length;i++){
            System.out.println(soln[i]);
            
        }

    }        
    
}
