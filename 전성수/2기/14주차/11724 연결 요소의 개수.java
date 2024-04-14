import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	static int [] parents;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		int [] [] map = new int [N+1][N+1];
		
		for(int i = 0; i<M; i++) {
			String [] row = br.readLine().split(" ");
			int st =Integer.parseInt(row[0]);
			int ed =Integer.parseInt(row[1]);
			
			map[st][ed] = 1;
			map[ed][st] = 1;
		}
		boolean [] checked = new boolean [N+1];
		Queue<Integer> q = new LinkedList<>();
		int ans = 0;
		for(int i=1; i<=N; i++) {
			if(!checked[i]) {
				q.add(i);
				checked[i] = true;
				ans++;
				while(!q.isEmpty()) {
					int now = q.poll();
					for(int j=1; j<=N; j++) { //수정 대기
						if(map[now][j]==1 && !checked[j]) {
							q.add(j);
							checked[j] = true;
						}
					}
				}
			}
		}
		System.out.println(ans);
	
	}
}
