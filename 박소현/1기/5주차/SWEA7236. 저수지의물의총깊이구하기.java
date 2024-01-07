import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Solution_저수지의물의총깊이구하기 {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트케이스
 
        main: for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine()); // 저수지 크기
 
            String[][] water = new String[N][N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    water[i][j] = st.nextToken();
                }
            }
//          System.out.println(Arrays.deepToString(water));
 
            // 3시방향부터 시계방향으로 8방탐색
            int[] dr = { 0, 1, 1, 1, 0, -1, -1, -1 };
            int[] dc = { 1, 1, 0, -1, -1, -1, 0, 1 };
 
            int cnt = 0;
            int max = 0;
 
            // 8방탐색
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (water[r][c].equals("W")) { // W라면
                        cnt = 0;
                        for (int d = 0; d < 8; d++) {
                            // 이동할 위치
                            int nr = r + dr[d];
                            int nc = c + dc[d];
                             
                            // 범위 제한
                            if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
                                if (water[nr][nc].equals("W"))
                                    cnt++;
                            }
                        } // d
                    }
                    if (cnt > max)
                        max = cnt;
                }
            } // 8방탐색
             
            // 출력
            if (cnt == 0)
                System.out.println("#" + tc + " " + 1);
            else System.out.println("#" + tc + " " + max);
             
        } // tc for
    } // main
 
}
