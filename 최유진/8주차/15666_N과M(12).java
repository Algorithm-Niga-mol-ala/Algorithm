package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bj_15666 {
	
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
		for(int i = now; i < N; i++) {
			if(prev != arr[i]) {
				res[idx] = arr[i];
				prev = arr[i];
				perm(idx+1, i);
			}
		}
		
	}

}
