import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class solution{
    String solve(int a, int b, int c){

        if(a+b>=10) return "YES";
        if(a+c>=10) return "YES";
        if(b+c>=10) return "YES";
        return "NO";

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution obj = new solution();
        int run = Integer.parseInt(sc.nextLine());
         List<String> soln = new ArrayList<>();

        while(run>0){
            String line = sc.nextLine();
            String arr[] = line.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            soln.add(obj.solve(a,b,c));
            run--;
            
        }
        for(int i =0; i<soln.size();i++){
            System.out.println(soln.get(i));
        }
        sc.close();
    }
}