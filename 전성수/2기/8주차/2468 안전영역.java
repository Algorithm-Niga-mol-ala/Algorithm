import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		
		int N = Integer.parseInt(br.readLine());
		
		int [] [] map = new int [N][N];
		int max = 0;
		for(int i=0; i<N; i++) {
			String [] str = br.readLine().split(" ",0);
			for(int j=0; j<N; j++) {
				int now = Integer.parseInt(str[j]);
				map[i][j] = now;
				if(max<now) max = now;
			}
		}
		boolean [] [] checked;
		int [] dr = new int [] {-1,0,1,0};
		int [] dc = new int [] {0,1,0,-1};//북 동 남 서
		int ans = 0;
		for(int i=1; i<=max; i++) {
			checked = new boolean[N][N];
			for(int j=0; j<N; j++) {
				for(int k=0; k<N; k++) {
					if(map[j][k]<i) {
						checked[j][k] = true;
					}
				}
			}
			
			
			int cnt =0;
			for(int j=0; j<N; j++) {
				for(int k=0; k<N; k++) {
					if(!checked[j][k]) {
						checked[j][k]=true;
						cnt ++;
						Queue<int []> q = new LinkedList<>();
						q.add(new int [] {j,k});
						while(!q.isEmpty()) {
							int [] now = q.poll();
							for(int t=0; t<4; t++) {
								int nr = now[0]+dr[t];
								int nc = now[1]+dc[t];
								if(nr>=0 && nr<N && nc>=0 && nc<N && !checked[nr][nc]) {
									checked[nr][nc]= true;
									q.add(new int[] {nr,nc});
								}
							}
						}
					}
				}
			}
			if(ans<cnt) ans = cnt;
		}
		
		System.out.println(ans);
		
	}
	
	

}
