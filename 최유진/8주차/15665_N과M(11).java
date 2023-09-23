package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bj_15665 {
	
	public static int N, M;
	public static int[] arr, res;
	public static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = br.readLine().split(" ");
		sb = new StringBuilder();
		
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		String[] input2 = br.readLine().split(" ");
		
		arr = new int[N];
		res = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(input2[i]);
		}
		
		Arrays.sort(arr); // 1 7 9 9
		perm(0);
		
		bw.write(sb.toString());
		bw.close();
		
	}
	
	public static void perm(int idx) {
		
		if(idx == M) {
			for(int i = 0; i < M; i++) {
				sb.append(res[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
    //같은 자리에 넣는 숫자가 이전과 같아서는 안 된다. 
    //perm이 시작될 때 마다 prev 초기화 (= for 문 안에서만 prev를 체크한다.)
    int prev = -1; 
    
		for(int i = 0; i < N; i++) {
			if(prev != arr[i]) { 
        //추가한 조건 : 이전에 넣은 값이 현재 고르는 값과 다를 경우에만!
        //정렬을 했기 때문에 이전과 같은데 뽑으면, 똑같은 수가 res에 똑같은 수가 또 들어간다는 것을 의미한다.
        
        // ex1) 1 7 9 9 에서 2개 뽑을 때
        // 1 "1" ok
        // 1 "7" 바로 이전에 1 뽑았으니까 ok
        // 1 "9" 바로 이전에 7 뽑았으니까 ok
        // "1" 9 를 뽑아야 하지만 이전에 뽑은 수가 9 였으므로 이 경우는 pass
        // 7 "1" 바로 이전에 1 뽑았으니까 res[0]에는 7. ok
        // 7 "7" 바로 이전에 1 뽑았으니까 ok. 
        // ... 반복

        // ex2) 1 1 2 2 에서 4개 뽑을 때
        // 1 1 1 "1" ok
        // 1 1 1 "1" 이전에 1 뽑았으니까 pass
        // 1 1 1 "2" 바로 이전에 1 뽑았으니까 ok
        // 1 1 1 "2" 바로 이전에 2 뽑았으니까 pass
        // for문 다 끝나고 돌아와서 prev는 res[3]인 1이다. 따라서 res[3]에 2 넣어주기
        // 1 1 2 "1" ok
        // 1 1 2 "1" 바로 이전에 1 뽑았으니까 pass
        // 1 1 2 "2" 바로 이전에 1 뽑았으니까 ok
        // 1 1 2 "2" 바로 이전에 2 뽑았으니까 pass
        // for문 다 끝나고 돌아와서 x 2번 prev는 res[2]인 1이다. res[2]에 2 넣어주기
        // 1 2 1 "1" 
        // ... 반복
        
				res[idx] = arr[i];
				prev = arr[i]; //prev는 이번 차례에 res에 들어간 요소
				perm(idx+1);
			}
		}
		
	}

}
