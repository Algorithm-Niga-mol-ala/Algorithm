
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
		
		String [] nm = br.readLine().split(" ",0);
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		int [] [] map = new int [n][m];
		boolean [] [] checked = new boolean [n][m];
		for(int i=0; i<n; i++) {
			String [] row = br.readLine().split(" ",0);
			for(int j=0; j<m; j++) {
				int now = Integer.parseInt(row[j]);
				map[i][j] = now;
				if(now==1) {
					checked[i][j] = true;
				}
			}
		}
		int [] dr = new int [] {1,0,-1,0};
		int [] dc = new int [] {0,1,0,-1};
		Queue<int[]> q = new LinkedList <>();
		int cnt =0;
		int max = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(checked[i][j]) {
					int size = 0;
					cnt++;
					q.add(new int[] {i,j});
					checked[i][j] =false;
					while(!q.isEmpty()) {
						int [] now = q.poll();
						int r = now[0];
						int c = now[1];
						size++;
						for(int k=0; k<4; k++) {
							int nr = r+dr[k];
							int nc = c+dc[k];
							if(nr>=0 && nr<n && nc>=0 && nc<m && checked[nr][nc]) {
								q.add(new int[] {nr,nc});
								checked[nr][nc] = false;
							}
						}
					}
					max = Math.max(max, size);
				}
			}
		}
		System.out.println(cnt);
		System.out.println(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
}
