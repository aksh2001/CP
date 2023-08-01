package A;
import java.util.ArrayList;
import java.util.Scanner;

public class magnet {
    int calcNumberOfGroups(ArrayList<Integer> arr){

        int numberOfGroups = 1;
        for(int i=0; i<arr.size()-1;i++){
            if(arr.get(i)!=arr.get(i+1)) numberOfGroups++;
        }



        return numberOfGroups;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        magnet ob = new magnet();

        int numberOfMagents = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> arr = new ArrayList<>();

        while(numberOfMagents>0){
            arr.add(Integer.parseInt(sc.nextLine()));
            numberOfMagents--;
        }
        System.out.println(ob.calcNumberOfGroups(arr));
        sc.close();


    }
    
}
