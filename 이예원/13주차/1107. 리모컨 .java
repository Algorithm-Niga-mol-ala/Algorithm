import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        boolean[] broken = new boolean[10]; //0~9 번의 버튼
    
        if(m != 0){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < m; i++){
                
                int n = Integer.parseInt(st.nextToken());
                broken[n] = true; //고장난 번호
            }
        }

        int res = Math.abs(target - 100); //초기값 설정 (현재 채널 100번)

        for(int i = 0; i <= 999999; i++){
            String str = String.valueOf(i);
            int len = str.length();

            boolean isBreak = false;

            for(int j = 0; j < len; j++){
                if(broken[str.charAt(j)-'0']){ //고장난 버튼을 눌러야 하면
                    isBreak = true;
                    break; //빠져나가기
                }
            }
            if(!isBreak){//고장난 버튼을 누르지 않는다면
                int min = Math.abs(target - i) + len; //i를 누른 후 target까지 이동하는 횟수
                res = Math.min(min, res);
            }
        }
        System.out.println(res);

    }
}
