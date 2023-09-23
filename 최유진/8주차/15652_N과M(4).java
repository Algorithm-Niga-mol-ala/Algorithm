import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static int N, M;
	public static int[] arr;
	public static int[] res;
	public static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		sb = new StringBuilder();
		
		arr = new int[N];
		res = new int[M];
		
		for(int i = 1; i <= N; i++) {
			arr[i-1] = i;
		}
		
		perm(0, 0);
		
		bw.write(sb.toString());
		bw.close();
	}
	
	public static void perm(int now, int idx) {
		
		if(idx == M) {
			
			for(int i = 0; i < M; i++) {
				sb.append(res[i]);
				sb.append(" ");
			}
			sb.append("\n");
			return;
		}
		
		
		for(int i = now; i < N; i++) {
			
			res[idx] = arr[i];
			perm(i, idx+1);
			
		}
		
	}

}
