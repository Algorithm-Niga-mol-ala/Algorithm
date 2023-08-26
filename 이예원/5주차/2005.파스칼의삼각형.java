import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int T = Integer.parseInt(br.readLine()); // tc
 
        for (int tc = 1; tc <= T; tc++) {
 
            int N = Integer.parseInt(br.readLine()); // 삼각형의 크기
 
            int[][] pascal = new int[N + 1][N + 1];
 
            for (int r = 0; r < N + 1; r++) {
                for (int c = 1; c <= r; c++) {
                    pascal[r][0] = 1;
                    pascal[r][c] = pascal[r - 1][c - 1] + pascal[r - 1][c];
 
                }
            }
             
            System.out.print("#" + tc );
            for (int r = 0; r < N+1; r++) {
                for (int c = 0; c < r; c++) {
                    System.out.print(pascal[r][c] + " ");
                }
                System.out.println();
            }
 
        } // tc
 
    }
 
}
