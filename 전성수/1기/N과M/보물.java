import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
public class Solution {
 
    // N은 4의 배수, 8이상 28 이하의 정수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
         
        int T = Integer.parseInt(br.readLine());
         
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#"+tc+" ");
            String[] NK = br.readLine().split(" ");
 
            int N = Integer.parseInt(NK[0]);
            int K = Integer.parseInt(NK[1]);
 
            String[] nums = br.readLine().split("");
 
            List<String> list = new ArrayList<>();
             //문자들
          
            List<String> pwd = new ArrayList<>();
            //완성된 비번을 담을 리스트
          
            for (int i = 0; i < N; i++) {
                list.add(nums[i]);
            }
 
            int rot = N / 4;
             //한면에 있는 문자의 개수
          
            for (int i = 0; i < rot; i++) { // rot 만큼 돌음
                for (int j = 0; j < N; j += rot) { //각 면의 첫번째 문자의 인덱스
                     
                    StringBuilder p = new StringBuilder(); //문자를 합치기 위해
                    for(int k=0;k<rot; k++ ) { // 각 면의 문자 인덱스
                        p.append(list.get(j+k)); //문자 더해주고
                    }
                    pwd.add(p.toString());//완성된 비번 넣기
                     
                }
                list.add(0,list.remove(N-1));//시계방향 회전이니까 맨 뒤가 맨 앞이 됨
            }
            Integer [] ans = new Integer [N];
             
            for (int i = 0; i < N; i++) {
                 
                int p = Integer.parseInt(pwd.get(i),16);
                ans[i]=p;
 
            }
             
            Arrays.sort(ans, Collections.reverseOrder());
            int tmp =-1;
            int cnt=0;
            for(int i=0; i<N; i++) {
                if(ans[i]!=tmp) {
                    tmp=ans[i];
                    cnt++;
                }
                if(cnt==K) {
                    sb.append(String.valueOf(ans[i])).append("\n");
                }
            }
             
 
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
