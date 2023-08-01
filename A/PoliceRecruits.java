package A;
import java.util.Arrays;
import java.util.Scanner;

public class PoliceRecruits {
    int calculateCrimes(int[] list){
        
        int policeRecruited = 0;
        int crimeCommited = 0;

        for(int i=0; i<list.length;i++){

            policeRecruited += list[i];
            if(policeRecruited<0&& list[i]<0){
                policeRecruited = 0;

                crimeCommited++; 
            }


        }
        return crimeCommited;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        int[] crime = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        PoliceRecruits ob = new PoliceRecruits();
        System.out.println(ob.calculateCrimes(crime));
        sc.close();


    }
    
}
