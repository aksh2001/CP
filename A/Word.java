package A;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        int countU = 0;
        int countL = 0;

        for(int i=0; i<input.length();i++){
            char ch = input.charAt(i);
            if(ch<=90 && ch>=65) countU++;
            else countL++;
        }
        if(countU>countL) System.out.println(input.toUpperCase());
        else System.out.println(input.toLowerCase());
        sc.close();
    }
    
}
