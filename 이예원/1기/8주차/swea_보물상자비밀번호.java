import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
import sun.util.locale.StringTokenIterator;
 
public class Solution {
 
    public static void main(String[] args) throws IOException {
        /*
         * 입력 tc 개수 T
         * 
         * 각 tc의 첫째줄 -> 숫자의 개수 N, 크기 순서 K 둘째줄 -> 16진수 0~F숫자가 공백없이 N개 주어짐
         * 
         * 
         * 출력 #tc K번째로 큰 수를 10진수로 변환한 값
         * 
         * 
         */
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int T = Integer.parseInt(br.readLine());// tc개수
 
        for (int tc = 1; tc <= T; tc++) {
 
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            int N = Integer.parseInt(st.nextToken()); // 숫자의 개수
 
            int K = Integer.parseInt(st.nextToken()); // 크기 순서
 
            char[] password = new char[N];
 
            String str = br.readLine();
 
            for (int i = 0; i < N; i++) {
                password[i] = str.charAt(i);
            } // 각 숫자를 배열에 저장
 
            // 0회전 (처음 그 자리 일 때)
            int L = N / 4; // 이게 회전 돌릴 수?
 
            int[] result = new int[N]; // 회전 다 돌린 다음 string 담아줄 배열
 
            String[] forSort = new String[4]; // 회전마다 생기ㅣ는 경우의 수 담아줄 배열
 
            int nIndex = 0;
            for (int a = 0; a < L; a++) {
 
                String tmp = "";
 
                 
                for (int i = 0, k = 0; i < N; i += L, k++) {
                    tmp = "";
                    for (int j = i; j < i + L; j++) {
                        tmp += password[j];
                    }
                    forSort[k] = tmp;
                     
                result[nIndex++] = Integer.parseInt(forSort[k],16);
//                System.out.print(Arrays.toString(result));
                } // 여기까지 0회전 일 때 나오는 수를 담아줬음.
 
                // 배열 요소들 하나씩 뒤로 땡겨주기
 
                char tmp2 = password[N - 1];
                for (int i = N - 1; i > 0; i--) {
 
                    password[i] = password[i - 1];
 
                }
                password[0] = tmp2;
 
            } // 회전 돌림

             
            Arrays.sort(result);

            int[] arrTemp = Arrays.stream(result).distinct().toArray();
             
            System.out.println("#" + tc + " " + arrTemp[arrTemp.length-K]);
 
        } // tc
 
    }// main
 
}
