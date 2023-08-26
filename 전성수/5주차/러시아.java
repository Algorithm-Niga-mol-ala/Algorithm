import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Solution {
    public static int idx = 0;
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
 
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
     
            sb.append("#"+tc+" ");
            // T 번의 반복
            StringTokenizer st = new StringTokenizer(br.readLine());
            // N, M 값 입력 받기
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
 
            String[][] flag = new String[N][M];
            // N*M크기의 배열 flag
 
            for (int i = 0; i < N; i++) {
                // N줄의 입력받기
                String[] line = br.readLine().split("");
                flag[i] = line;
         림
                    b=1;
                    w++;
                }
                 
            }
             
            
            sb.append(cnt+"\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
 
}
