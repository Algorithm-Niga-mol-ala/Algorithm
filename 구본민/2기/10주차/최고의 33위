import java.util.*;

public class Main {
    public static final int MAX_N = 20;
    public static int n;
    public static int[][] map  = new int[MAX_N][MAX_N];

    public static int getSumOfCoin(int rowSt, int rowEd, int colSt, int colEd){
        int sumOfCoin =0;

        for(int i=rowSt; i<=rowEd; i++){
            for(int j=colSt; j<=colEd; j++){
                sumOfCoin += map[i][j];
            }
        }
        return sumOfCoin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[i][j] = sc.nextInt();
            }
        }

       int maxCoin = 0;
       for(int i =0;i<n;i++){
        for(int j=0;j<n;j++){
             if(i+2>=n || j+2>=n) continue;

             int sumOfCoin = getSumOfCoin(i, i+2, j, j+2);

            maxCoin = Math.max(sumOfCoin, maxCoin);
        }
       }
       System.out.print(maxCoin);
    }
}
