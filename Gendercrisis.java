import java.util.HashSet;
import java.util.Scanner;

public class Gendercrisis {
    String Distinctchar(String str){

        HashSet<Character> set=new HashSet<Character>(); 

        for(int i=0; i<str.length();i++){
            set.add(str.charAt(i));
        }

        if(set.size()%2!=0) return "IGNORE HIM!";
        else return "CHAT WITH HER!";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gendercrisis ob = new Gendercrisis();
        
        String input = sc.nextLine();
        System.out.println(ob.Distinctchar(input));
        sc.close();
    }
    
}
