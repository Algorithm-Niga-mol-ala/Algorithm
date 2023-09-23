package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bj_15664 {
	
	public static int N, M;
	public static int[] arr, res;
	public static boolean[] visited;
	public static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		arr = new int[N];
		res = new int[M];
		visited = new boolean[N];
		sb = new StringBuilder();
		
		String[] input2 = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(input2[i]);
		}
		
		Arrays.sort(arr);
		
		perm(0, 0);
		
		bw.write(sb.toString());
		bw.close();
		
	}
	

	public static void perm(int idx, int now) {
		
		if(idx == M) {
			for(int i = 0; i < M; i++) {
				sb.append(res[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		int prev = -1;
		//now는 방금 고른 인덱스.
		//방금 고른 인덱스의 다음 인덱스부터 고려해야 함. 
		for(int i = now; i < N; i++) {
			if(visited[i]) continue;
			
			if(prev != arr[i]) {
				prev = arr[i];
				res[idx] = arr[i];
				visited[i] = true;
				perm(idx + 1, i);
				visited[i] = false;
			}
		}
		
	}

}
