package A;
import java.util.Scanner;

public class petya{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    String str1 = sc.nextLine().toLowerCase();
    String str2 = sc.nextLine().toLowerCase();

    if(str1.compareTo(str2) > 0) System.out.println(1);
    else if(str1.compareTo(str2)<0) System.out.println(-1);
    else System.out.println(0);

    sc.close();


    }
}