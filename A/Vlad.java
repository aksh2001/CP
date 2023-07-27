import java.util.Arrays;
import java.util.Scanner;

public class Vlad {

    int VladConversations(int[] a, int[] h){
        int totalConversations = 0;
        int m = a[1];
        int k = a[2];
        int H = a[3];

        for(int i=0;i<h.length;i++){
            int diff = Math.abs(H-h[i]);
            if(diff == 0) continue;
            if((diff % k)== 0 && (diff/k) < m) totalConversations++;
        }
        return totalConversations;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vlad ob = new Vlad();

        int testcases = Integer.parseInt(sc.nextLine());
        int[] solution = new int[testcases];

        while(testcases!=0){
            int[] arguements = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] heights = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            solution[solution.length-testcases] = ob.VladConversations(arguements,heights);
            testcases--;
        }
        for(int i=0; i<solution.length;i++){
            System.out.println(solution[i]);
        }
        sc.close();
    }
    
}
