package B;

///Optimise this

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class MonocarpGaming {
    ArrayList<Integer> sol = new ArrayList<>();
    void output(int [] m){
        
        for(int i=0; i<m.length;i++){
            if(m[i]<1){
                if(!sol.contains(i)) sol.add(i);
            }
        }
    }
    boolean GameEnds(int[] a){
        for(int i=0; i<a.length; i++){
            if(a[i]>0) return false;
        }
        return true;
    }
    int FindLargestelement(int[] m){
        int[] a = new int[m.length];
        for(int i=0; i<a.length;i++){
            a[i] = m[i];
        }

        Arrays.sort(a);
    

        return a[a.length-1];
    }
    
    int findElement(int[] a, int l){
        
        for(int i=0; i<a.length;i++){
            if(a[i]==l) {
                
                return i;
            }
        }
        return -1;

    }
    void DeathSeq(int n, int k, int[] m){
        
        while(!GameEnds(m)){
            int index = findElement(m, FindLargestelement(m));
            
            m[index] -= k;
            output(m);
        }
    }
    String print(){
        String s="";
        for(int i=0;i<sol.size();i++){
            s += (sol.get(i)+1)+" ";
        }
        s.trim();
        System.out.println(s);
        sol.clear();
        return s;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MonocarpGaming ob = new MonocarpGaming();
        int testcase = Integer.parseInt(sc.nextLine());
        String [] soln = new String[testcase];
        while(testcase!=0){

            int[] nk = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] monsters = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            ob.DeathSeq(nk[0], nk[1], monsters);

            soln[soln.length-testcase] = ob.print();
            testcase--;
        }
        for(int i=0;i<testcase;i++){
            System.out.println(soln[i]);
        }
        sc.close();
    }

}
    

