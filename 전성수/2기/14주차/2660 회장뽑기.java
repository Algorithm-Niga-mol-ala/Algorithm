import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int [] [] map  = new int [N+1][N+1];
		
		while(true) {
			String [] row = br.readLine().split(" ");
			int st = Integer.parseInt(row[0]);
			int ed = Integer.parseInt(row[1]);
			
			if(st == -1) break;
			map[st][ed] = 1;
			map[ed][st] = 1;
		}
		Queue<int []> q = new LinkedList<>();
		int [] depth_arr = new int [N+1];
		int min = 51;
		for(int i=1; i<=N;i++) {
			boolean [] checked = new boolean[N+1];
			q.add(new int[] {i,0});
			checked[i] =true;
			int max_depth = 0;
			while(!q.isEmpty()) {
				int[] poll = q.poll();
				int now = poll[0];
				int depth = poll[1];
				max_depth = Math.max(max_depth, depth);
				for(int j=1; j<=N; j++) {
					if(map[now][j]==1&&!checked[j]) {
						q.add(new int[] {j,depth+1});
						checked[j] = true;
					}
				}
			}
			depth_arr[i] = max_depth;
			min = Math.min(min, max_depth);
		}
		sb.append(min+" ");
		int cnt=0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=N; i++) {
			if(depth_arr[i]==min) {
				cnt++;
				list.add(i);
			}
		}
		sb.append(cnt+"\n");
		for(int i=0; i<list.size(); i++) {
			sb.append(list.get(i)+" ");
		}
		System.out.println(sb.toString());
	}
}
