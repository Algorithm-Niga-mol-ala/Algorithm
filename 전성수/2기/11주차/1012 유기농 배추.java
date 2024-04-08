import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int [] dr = new int[] {-1,0,1,0};
		int [] dc = new int[] {0,1,0,-1};
		
		for (int t = 0; t < T; t++) {
			String[] MNK = br.readLine().split(" ", 0);
			int M = Integer.parseInt(MNK[0]);//열
			int N = Integer.parseInt(MNK[1]);//행
			int K = Integer.parseInt(MNK[2]);//위치 개수
			int [] [] map = new int[N][M];
			boolean[][] checked = new boolean[N][M];
			int cnt=0;
			for(int k=0; k<K;k++) {
				String [] XY = br.readLine().split(" ",0);
				int X = Integer.parseInt(XY[0]);
				int Y = Integer.parseInt(XY[1]);
				map[Y][X] = 1;
				checked[Y][X] = true;
			}
			Queue<int[]> q = new LinkedList<>();
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(map[i][j]==1 && checked[i][j]) {
						cnt++;
						q.add(new int[] {i,j});
						checked[i][j] = false;
						while(!q.isEmpty()) {
							int [] now = q.poll();
							int r = now[0];
							int c = now[1];
							for(int k=0; k<4; k++) {
								int nr = r+dr[k];
								int nc = c+dc[k];
								if(nr>=0 && nr<N && nc>=0 && nc<M && checked[nr][nc]) {
									q.add(new int[] {nr,nc});
									checked[nr][nc]=false;
								}
							}
							
						}
					}
				}
			}
			sb.append(cnt+"\n");
			
		}
		System.out.println(sb.toString());
	}
}
