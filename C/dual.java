import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dual {
    int[] arr = {1,9,3,-4,-3,-2,-1};
    ArrayList<ArrayList<Object>>soln = new ArrayList<>();
    boolean check(){
        boolean sorted = false; 
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;

        }
        return true;
    }
    void print(){
        String [] str =  new String[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                arr[i+1] += arr[i];
                str[j] = (i+1)+" "+i;
                
            }
        }
        
    }
    void finalprint(){
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dual ob = new dual();
        while(!ob.check()) ob.print();
        ob.finalprint();
       
        


        
    }
    
}
