


import java.util.Scanner;

public class squirrelLiss {

    int CalculateSteps(char[] seq, char[] inst){

        int steps = 1;
        int j=0;
        for(int i=0; i<inst.length;i++){
            if(seq[j]==inst[i]){
                 steps++;
                 j++;
            }

        }



        return steps;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        squirrelLiss ob = new squirrelLiss();
        char [] inputSeq = sc.nextLine().toCharArray();
        char [] instructions = sc.nextLine().toCharArray();

        System.out.println(ob.CalculateSteps(inputSeq,instructions));
        sc.close();

    }
    
}
