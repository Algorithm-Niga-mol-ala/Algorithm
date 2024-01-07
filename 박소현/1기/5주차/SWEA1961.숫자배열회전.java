import java.util.Arrays;
import java.util.Scanner;
 
public class Solution_숫자배열회전 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
 
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int[][] rotate = new int[N][N];
 
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    rotate[i][j] = sc.nextInt();
                }
            }
 
            // 90, 180, 270도 회전한 값들 담아줄 배열 생성
            int[][] one = new int[N][N];
            int[][] two = new int[N][N];
            int[][] three = new int[N][N];
 
            // 90도, 180도, 270도
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    one[j][N - 1 - i] = rotate[i][j];
                    two[N - 1 - i][N - 1 - j] = rotate[i][j];
                    three[N - 1 - j][i] = rotate[i][j];
                }
            }
             
//          // 다른 방법
//          for (int i = 0; i < N; i++) {
//              for (int j = 0; j < N; j++) {
//                  one[i][N - 1 - i] = rotate[i][j];
//              }
//          }
//          for (int i = 0; i < N; i++) {
//              for (int j = 0; j < N; j++) {
//                  two[i][N - 1 - i] = one[i][j];
//              }
//          }
//          for (int i = 0; i < N; i++) {
//              for (int j = 0; j < N; j++) {
//                  three[i][N - 1 - i] = two[i][j];
//              }
//          }
             
//          System.out.println(Arrays.deepToString(one));
//          System.out.println(Arrays.deepToString(two));
//          System.out.println(Arrays.deepToString(three));
 
            System.out.println("#" + tc);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(one[i][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < N; j++) {
                    System.out.print(two[i][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < N; j++) {
                    System.out.print(three[i][j]);
                }
                System.out.println();
            }
        } // tc for
    } // main
 
}
