import java.util.ArrayList;
import java.util.Scanner;
public class LID {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> soln = new ArrayList<>();
        int testcases = Integer.parseInt(sc.nextLine());
        while(testcases!=0){
            long n= Long.parseLong(sc.nextLine());
            if(n%2!=0) soln.add(1);
            else if(n==2) soln.add(2);
            else if(n==4) soln.add(2);
            else if(n==6) soln.add(3);
            else{
                for(int i=0;i< n/2;i++){
                    if(n%(i+1)==0) continue;
                    else{
                        soln.add(i);
                        break;
                    }

                }
            }
            testcases--;
        
        }
        for(int i=0; i<soln.size();i++){
            System.out.println(soln.get(i));
        }
        
        
        
        sc.close();
        
    }
    
}
    
