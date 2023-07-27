import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SerjaAndDimma {
    int[] biggestSum(List<Integer> arr){
        int Serja = 0;
        int Dimma = 0;
        int numberOfTurns = arr.size();
        for(int i=0; i<numberOfTurns; i++){
            int firstCard = arr.get(0);
            int LastCard = arr.get(arr.size()-1);
            
            if(i%2==0){
                if(firstCard>LastCard){
                    Serja += firstCard;
                    arr.remove(0);
                }
                else{
                    Serja += LastCard;
                    arr.remove(arr.size()-1);
                }
            }
            else{
                if(firstCard>LastCard){
                    Dimma += firstCard;
                    arr.remove(0);
                }
                else{
                    Dimma += LastCard;
                    arr.remove(arr.size()-1);
                }
                
            }
        }
        return new int[] {Serja, Dimma};
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SerjaAndDimma ob = new SerjaAndDimma();

        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        int[] cards = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        List<Integer> intList = new ArrayList<Integer>();
        for(int n : cards) {
            intList.add(n);
        }
        int[] result = ob.biggestSum(intList);

        for(int i=0; i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        sc.close();



        
    }
    
}
