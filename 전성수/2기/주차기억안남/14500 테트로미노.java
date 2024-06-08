import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	static int [] [] map;
	static boolean [] [] checked;
	static int max = 0;
	static int [] dr = new int [] {0,1,0,-1};//동 남 서 북
	static int [] dc = new int [] {1,0,-1,0};
	static int N,M;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String [] NM = br.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);
		map = new int[N][M];
		checked = new boolean[N][M];
		for(int i=0; i<N; i++) {
			String [] row = br.readLine().split(" ");
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(row[j]);
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				checked[i][j] = true;
				dfs(map[i][j],i,j,1);
				checked[i][j] = false;
				combi(map[i][j],i,j,0,0);
			}
		}
		System.out.println(max);
	}
	
	
	
	private static void combi(int ans, int i, int j,int depth,int st) {
		
		if(depth==3) {
			max = Math.max(max,ans);
			return;
		}
		for(int k=st; k<4; k++) {
			int nr = i+dr[k];
			int nc = j+dc[k];
			
			if(nr<0 || nr>=N || nc<0 || nc>=M ) {
				continue;
			}
			combi(ans+map[nr][nc],i,j,depth+1,k+1);
		}
	}



	static void dfs(int ans, int i, int j, int depth) {
		if(depth==4) {
			max = Math.max(max, ans);
			return;
		}
		
		for(int k=0; k<4;k++) {
			int nr = i+dr[k];
			int nc = j+dc[k];
			if(nr<0 || nr>=N || nc<0 || nc>=M || checked[nr][nc]) {
				continue;
			}
			checked[nr][nc] =true;
			dfs(ans+map[nr][nc],nr,nc,depth+1);
			checked[nr][nc] =false;
		}
	}

}
