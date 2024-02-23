import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	static int [] parent;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String [] NM = br.readLine().split(" ",0);
		
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		int [] [] map = new int [N+1][M+1];
		boolean [] [] checked = new boolean[N+1][M+1];
		for(int i=1;i<=N;i++) {
			String [] row = br.readLine().split("",0);
			for(int j=0; j<M; j++) {
				int now =Integer.parseInt(row[j]);
				map[i][j+1] = now;
				if(now==1) {
					checked[i][j+1]=true;
				}
			}
		}
		
		Queue<int[]> q= new LinkedList<>();
		int[] dr = new int [] {-1,0,1,0};
		int[] dc = new int [] {0,1,0,-1};
		q.add(new int [] {1,1,1});
		checked[1][1] = false;
		int ans =0;
		while(!q.isEmpty()) {
			int [] now = q.poll();
			int r = now[0];
			int c = now[1];
			int dis = now[2];
			if(r==N && c==M) { 
				ans = dis;
				break;
			}
			for(int k=0; k<4; k++) {
				int nr = r+dr[k];
				int nc = c+dc[k];
				if(nr>=1 && nr<=N && nc >=1 && nc <=M && checked[nr][nc]) {
					q.add(new int [] {nr,nc,dis+1});
					checked[nr][nc] = false;
				}
			}
		}
		System.out.println(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
}
