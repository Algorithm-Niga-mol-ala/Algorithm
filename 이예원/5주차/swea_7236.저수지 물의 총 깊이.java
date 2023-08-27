import java.util.Arrays;
import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
 
        for (int tc = 1; tc <= T; tc++) {
 
            int N = sc.nextInt(); // 저수지의 넓이
            String[][] map = new String[N][N]; // 배열 만들기
 
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    map[r][c] = sc.next();
                }
            } // 저수지 정보 입력
 
            // 상 우상 우 우하 하 좌하 좌 좌상
            int[] dr = { -1, -1, 0, 1, 1, 1, 0, -1 };
            int[] dc = { 0, 1, 1, 1, 0, -1, -1, -1 };
 
            int maxDepth = 0; // 가장 깊은 곳의 깊이
            int cnt = 0;
 
            // 배열을 하나씩 돌면서 8방탐색해주기
 
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    // 내가 서있는 곳이 W 일 때
                    if (map[r][c].equals("W")) {
                        for (int d = 0; d < 8; d++) {
 
                            int nr = r + dr[d];
                            int nc = c + dc[d];
 
                            if (nr < N && nr >= 0 && nc < N && nc >= 0 && map[nr][nc].equals("W")) {
                                cnt++;
                            } // 내 근처에 있는 요소가 W면 카운트
 
                        }
                    } // 8방탐색
                    if (cnt == 0) {
                        cnt = 1;
                    } // W가 하나도 없으면 1로 설정
 
                    if (cnt > maxDepth) {
                        maxDepth = cnt;
                    }
 
                    cnt = 0; // 카운트 초기화
 
                }
            }
 
            System.out.println("#" + tc + " " + maxDepth);
 
        } // tc
 
    }// main
 
}
