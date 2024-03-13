import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	static int N;
	static boolean [] [] checked;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(br.readLine());
		checked = new boolean[N][N];
		for(int i=0; i<N; i++) {
			String [] row = br.readLine().split("",0);
			for(int j=0; j<N; j++) {
				int now = Integer.parseInt(row[j]);
				if(now==0) checked[i][j] = true;
			}
		}
		int cnt =0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(!checked[i][j]) {
					checked[i][j] = true;
					pq.add(bfs(i,j));
					cnt++;
				}
			}
		}
		sb.append(cnt+"\n");
		while(!pq.isEmpty()) {
			sb.append(pq.poll()+"\n");
		}
		System.out.println(sb.toString());
	}

	private static Integer bfs(int i, int j) {
		int []dr = new int[] {-1,0,1,0};
		int []dc = new int[] {0,1,0,-1};
		Queue<int []> q = new LinkedList<>();
		q.add(new int[] {i,j});
		int cnt =0;
		while(!q.isEmpty()) {
			int [] now = q.poll();
			cnt++;
			int r = now[0];
			int c = now[1];
			for(int k=0; k<4; k++) {
				int nr = r+dr[k];
				int nc = c+dc[k];
				if(nr>=0 && nr<N && nc>=0 && nc<N &&!checked[nr][nc]) {
					q.add(new int[] {nr,nc});
					checked[nr][nc] = true;
				}
			}
		}
		return cnt;
	}

}
