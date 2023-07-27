import java.util.Scanner;

public class beautifulMatrix {
    int row = 0;
    String[][] grid = new String[5][5];
    int row1,col1;
    
    void constructGrid(String[] line){

        for(int i=0; i<5;i++){

            if(line[i].equals("1")){
                row1 = row+1;
                col1 = i+1;
            }
            grid[row][i] = line[i];
        }
        row++;

    }
    int moves(){
        return Math.abs(row1-3)+Math.abs(col1-3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        beautifulMatrix ob = new beautifulMatrix();

        for(int i=0; i<5;i++){

            String[] inputLine = sc.nextLine().split(" ");
            ob.constructGrid(inputLine);
        }

        System.out.println(ob.moves());
        sc.close();
    }
    
}
