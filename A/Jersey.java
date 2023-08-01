package A;
import java.util.Arrays;
import java.util.Scanner;

public class Jersey {
    int CalculateMatches(int[][] arr){
        int totalMatches = 0;
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if(arr[i][0]==arr[j][1]) totalMatches++;
            }
        }
        return totalMatches;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jersey ob = new Jersey();


        int noTeams = Integer.parseInt(sc.nextLine());
        
        int[][] jerseyColor = new int[noTeams][2];
        while(noTeams!=0){
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            jerseyColor[jerseyColor.length-noTeams][0] = arr[0];
            jerseyColor[jerseyColor.length-noTeams][1] = arr[1];
            noTeams--;
        }
        System.out.println(ob.CalculateMatches(jerseyColor));
        sc.close();
    }
    
}
