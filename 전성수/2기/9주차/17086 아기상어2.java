import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String [] NM = br.readLine().split(" ",0);
		
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		int [] [] map = new int [N][M];
		boolean [] [] checked = new boolean [N][M];
		PriorityQueue<int [] > pq = new PriorityQueue<>((o1,o2)->o1[2]-o2[2]);
		for(int i=0; i<N; i++) {
			String [] row = br.readLine().split(" ",0);
			for(int j=0; j<M; j++) {
				int now = Integer.parseInt(row[j]);
				map[i][j] = now;
				if(now==1) {
					pq.add(new int[] {i,j,0});
					checked[i][j] =true;
				}
			}
		}
		
		int ans = 0;
		int [] dr = new int [] {-1,-1,0,1,1,1,0,-1}; // 12 1 3 4 6 7 9 10 8방
		int [] dc = new int [] {0,1,1,1,0,-1,-1,-1};
		
		while(!pq.isEmpty()) {
			int [] now = pq.poll();
			int r = now[0];
			int c = now[1];
			int dist = now[2];
			if(dist>ans) ans = dist;
			
			for(int k=0; k<8; k++) {
				int nr = r+dr[k];
				int nc = c+dc[k];
				if(nr>=0 && nr <N && nc>=0 && nc<M && !checked[nr][nc]) {
					pq.add(new int[] {nr,nc,dist+1});
					checked[nr][nc] = true;
				}
			}
			
			
		}
		
		System.out.println(ans);
		
	}
}
