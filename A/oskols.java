import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class oskols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int noOfWires =  Integer.parseInt(sc.nextLine());
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        int [] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i=0; i<input.length;i++){
            map.put(i+1,input[i]);
        }
        int testcase = Integer.parseInt(sc.nextLine());

        while(testcase>0){

            int [] shot = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(noOfWires ==1){
                map.replace(1,0);
                break;
            }
            if(shot[0]>1 && shot[0]<noOfWires){
                int deci =  map.get(shot[0]-1)+shot[1]-1;
                
                int inci = map.get(shot[0]+1)+map.get(shot[0])-shot[1];
                map.replace(shot[0]-1,deci);
                map.replace(shot[0]+1, inci);
            }
            else if(shot[0]==1){
                int inci = map.get(shot[0]+1)+map.get(shot[0])-shot[1];
                map.replace(shot[0]+1, inci);
            }
            else if(shot[0]==noOfWires){
                int deci =  map.get(shot[0]-1)+shot[1]-1;
                map.replace(shot[0]-1, deci);
            }
            map.replace(shot[0],0);
            
            testcase--;
        }
        for( int i=0; i<map.size();i++){
            System.out.println(map.get(i+1));
        }
        sc.close();
    }
    
}
