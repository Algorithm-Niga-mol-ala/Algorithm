
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
//1초 1억

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	static StringBuilder sb;
	static int N,M;
	static boolean[] visited;
	static int[] ans;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		
		String [] NM = br.readLine().split(" ");
		
		N = Integer.parseInt(NM[0]);	//1부터 N까지의 자연수
		M= Integer.parseInt(NM[1]); 	//M개 선택한 수열
		visited = new boolean[N+1];
		ans = new int[M];
		dfs(0, 0);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void dfs(int cnt,int idx) {
		if(cnt==M) {
			for(int i=0; i<M; i++) {
				sb.append(ans[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1; i<N+1; i++) {
			if(visited[i]) continue;
			//들어간 적 있는지 확인
			
			ans[idx]=i;
			//없으면 넣고 방문체크
			visited[i]=true;
			//넣었으니까 cnt를 올리고 ans 배열의 다음 자리를 바라봄
			dfs(cnt+1,idx+1);
			//끝까지 갔으면 방문체크를 원래대로 돌림
			visited[i]=false;
			
		}
	}

}
