import java.util.Arrays;
import java.util.Scanner;

public class BlackSquare {
    int CountChar(String s, Character ch){
        int count =0;
        for(int i=0; i<s.length();i++) if(s.charAt(i) == ch) count++;
        return count;
    }
    int CountCalories(int[] a, String bq){
        int count =0;
        count = a[0]*CountChar(bq, '1')+a[1]*CountChar(bq, '2')+a[2]*CountChar(bq, '3')+a[3]*CountChar(bq, '4');
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String bq = sc.nextLine();
        BlackSquare ob = new BlackSquare();
        System.out.println(ob.CountCalories(a,bq));
        sc.close();
    }
    
}
