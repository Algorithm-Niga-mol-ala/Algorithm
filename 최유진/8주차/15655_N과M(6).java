import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	
	public static int N, M;
	public static int[] arr;
	public static boolean[] visited;
	public static int[] res;
	public static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		arr = new int[N];
		visited = new boolean[N];
		res = new int[M];
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
		
		for(int i = now; i < N; i++) {
			
			if(visited[i]) continue;
			
			visited[i] = true;
			res[idx] = arr[i];
			perm(idx+1, i);
			visited[i] = false;
			
		}
		
		
		
	}

}
