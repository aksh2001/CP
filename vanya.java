
import java.util.Scanner;

public class vanya {
    int calculateWidth(String[] n, String h){

        int width = 0;

        for(int i = 0; i<n.length;i++){

            if(Integer.parseInt(n[i])>Integer.parseInt(h)) width += 2;
            else width++;

        }
        return width;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vanya obj = new vanya();
        String line1 = sc.nextLine();
        String input[] = line1.split(" ");
        
        String line2 = sc.nextLine();
        String input2[] = line2.split(" ");


        System.out.println(obj.calculateWidth(input2, input[1]));


         
        sc.close();
    }
        
}



    

