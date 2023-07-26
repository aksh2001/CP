
import java.util.Scanner;

public class StonesOnTable {
    int neighbouringStones(String stones){
        int count = 0;
        for(int i=0; i<stones.length()-1;i++){
            if(stones.charAt(i) == stones.charAt(i+1)) count++;
        }

        return count;
    

    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        StonesOnTable ob = new StonesOnTable();
        sc.nextLine();
        String input = sc.nextLine();

        System.out.println(ob.neighbouringStones(input));
        sc.close();


    }    
}
