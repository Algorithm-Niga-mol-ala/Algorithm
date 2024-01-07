import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Solution_중간평균값구하기 {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
 
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[10];
 
            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
 
            Arrays.sort(arr);
//          System.out.println(Arrays.toString(arr));
 
            int sum = 0;
            for (int i = 1; i < 9; i++) {
                sum += arr[i];
            }
            double avg = Math.round(sum / 8.0); // 반올림 먹여줄라면 double로 구하고
 
            System.out.println("#" + tc + " " + (int) avg); // int로 출력!!!!!!!!!!
 
        } // tc for
    }// main
 
}
