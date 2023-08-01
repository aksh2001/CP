import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonLetters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Set<Character> s = new HashSet<Character>();

        for(int i=0; i<input.length();i++){
            if(input.charAt(i)>96 && input.charAt(i)<123) s.add(input.charAt(i));
            
        }
        System.out.println(s.size());
        sc.close();
    }
}
    