package java23;

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
		
		int T = Integer.parseInt(br.readLine());
		
		loop: for(int t=0; t<T; t++) {
			
			int n = Integer.parseInt(br.readLine());//편의점 개수
			int [] [] map = new int[n+2][2];
			String [] home_rc = br.readLine().split(" ",0);
			map[0][0] = Integer.parseInt(home_rc[0]);
			map[0][1] = Integer.parseInt(home_rc[1]);
			for(int i=1; i<=n; i++) {
				String [] conve_rc = br.readLine().split(" ",0);
				map[i][0] = Integer.parseInt(conve_rc[0]);
				map[i][1] = Integer.parseInt(conve_rc[1]);
			}
			
			String [] festa_rc = br.readLine().split(" ",0);
			map[n+1][0] = Integer.parseInt(festa_rc[0]);
			map[n+1][1] = Integer.parseInt(festa_rc[1]);
			boolean[] checked = new boolean[n+2];
			Queue<int []> q = new LinkedList<>();
			q.add(new int[] {map[0][0],map[0][1]});
			checked[0] = true;
			while(!q.isEmpty()) {
				int [] now = q.poll();
				if(Math.abs(now[0]-map[n+1][0])+Math.abs(now[1]-map[n+1][1])<=1000) {
					sb.append("happy").append("\n");
					continue loop;
				}
				for(int i=1;i<=n;i++) {
					if(!checked[i]) {
						int dist_r = Math.abs(now[0]-map[i][0]);
						int dist_c = Math.abs(now[1]-map[i][1]);
						if(dist_r+dist_c<=1000) {
							q.add(new int[] {map[i][0],map[i][1]});
							checked[i]=true;
						}
					}
				}
			}
			sb.append("sad").append("\n");
		}
		System.out.println(sb.toString());
	}
}
