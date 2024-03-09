import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	static int[] team;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int k = Integer.parseInt(br.readLine());

		TC: for (int t_c = 0; t_c < k; t_c++) {
			String[] VE = br.readLine().split(" ", 0);

			int V = Integer.parseInt(VE[0]);
			int E = Integer.parseInt(VE[1]);
			List<List<Integer>> list = new ArrayList<>();
			for(int i=0; i<=V; i++) {
				list.add(new ArrayList<Integer>());
			}
			
			for(int i=0; i<E; i++) {
				String [] edge = br.readLine().split(" ",0);
				int st = Integer.parseInt(edge[0]);
				int ed = Integer.parseInt(edge[1]);
				
				list.get(st).add(ed);
				list.get(ed).add(st);
			}
			
			int[] checked = new int[V+1];
			Queue<Integer> q = new LinkedList<>();
			
			for(int i=1; i<=V; i++) {
				if(checked[i]==0) {
					q.add(i);
					checked[i]=1;
					while(!q.isEmpty()) {
						int now = q.poll();
						int now_color = checked[now];
						
						
						for(int j=0;j<list.get(now).size();j++) {
							if(checked[list.get(now).get(j)]==now_color) {
								sb.append("NO"+"\n");
								continue TC;
							}
							
							if(checked[list.get(now).get(j)]==0) {
								q.add(list.get(now).get(j));
								checked[list.get(now).get(j)]=-1*now_color;
							}
						}
					}
				}
			}
			sb.append("YES"+"\n");
		}
		System.out.println(sb.toString());
	}
	
	
}
