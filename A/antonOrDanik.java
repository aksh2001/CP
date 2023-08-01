
import java.util.Scanner;

public class antonOrDanik {
    String whoWon(String a){
        int count =0;
        for(int i = 0; i<a.length();i++){
            if(a.charAt(i)=='A') count++;
        }
        if(count>(float)a.length()/2) return "Anton";
        else if(count<(float)a.length()/2) return "Danik";
        else return "Friendship";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antonOrDanik obj = new antonOrDanik();
        sc.nextLine();
        String line2 = sc.nextLine();
        System.out.println(obj.whoWon(line2));
        sc.close();
    }
    
}
