import java.util.Arrays;
import java.util.Scanner;
  
public class Solution_스도쿠검증 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
  
        int[][] sdoku = new int[9][9];
        int N = sdoku.length;
  
        for (int tc = 1; tc <= T; tc++) {// 테스트케이스
            boolean flag = true;
  
            // 1. 스도쿠 배열에 입력값 넣어주기
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sdoku[i][j] = sc.nextInt();
                }
            } // 1
  
            // 2. 행 탐색
            main1: for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    for (int k = j + 1; k < N; k++) {
//                      System.out.print("\"" + sdoku[i][j]);
//                      System.out.print(sdoku[i][k] + "\"");
//                      System.out.println();
                        if (sdoku[i][j] == sdoku[i][k]) {
                            flag = false;
                            break main1;
                        }
                    }
                }
            } // 2
  
//          System.out.println(flag);
  
            // 3. 열 탐색
            main2: for (int j = 0; j < N; j++) {
                for (int i = 0; i < N; i++) {
                    for (int k = i + 1; k < N; k++) {
                        if (sdoku[i][j] == sdoku[k][j]) {
                            flag = false;
                            break main2;
                        }
                    }
                }
            } // 3
  
//          System.out.println(flag);
  
            // 4. 3*3 탐색
            int[] box = new int[9];
            int h = 0;
  
            main3: for (int k = 0; k < N; k += 3) {
                for (int l = 0; l < N; l += 3) {
                    for (int i = k; i < k + 3; i++) {
                        for (int j = l; j < l + 3; j++) {
                            box[h] = sdoku[i][j];
                            h++;
                        }
                    }
  
                    h = 0; // h의 범위가 9를 넘기지 않도록 초기화
//                  System.out.println(Arrays.toString(box)); // 확인용
  
                    for (int r = 0; r < 9; r++) {
                        for (int c = r+1; c < 9; c++) {
                            if (box[r] == box[c]) {
                                flag = false;
                                break main3;
                            }
                        }
                    }
                }
            } // 4
//          System.out.println(flag);
  
            if (flag == false)
                System.out.println("#" + tc + " " + 0);
            else
                System.out.println("#" + tc + " " + 1);
  
        } // tc for
  
    }
}
