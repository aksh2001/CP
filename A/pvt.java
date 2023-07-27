import java.util.Scanner;

public class pvt {

    boolean calculate(String[] confid){

        int count = 0;

        for(int i =0; i<confid.length;i++){


            if(confid[i].equals("1"))   count++;
            if(count==2) return true;

            
        }
        
        return false;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        pvt objPvt = new pvt();

        int testcase = Integer.parseInt(sc.nextLine());
        
        int problemSolved =0 ;

        
        while(testcase>0){
            String[] input = sc.nextLine().split(" ");
            

            
            if(objPvt.calculate(input)) problemSolved++;
            testcase--;
            }
        System.out.println(problemSolved);
        sc.close();
    }
}
    

