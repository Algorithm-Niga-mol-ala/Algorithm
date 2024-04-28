import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList; 
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String [] NM = br.readLine().split(" ",0);
		int N =Integer.parseInt(NM[0]);
		int M =Integer.parseInt(NM[1]);
		ArrayList<ArrayList<Integer>> list  = new ArrayList<>();
		
		for(int i=0; i<=N; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<M; i++) {
			String [] uv = br.readLine().split(" ",0);
			int u =Integer.parseInt(uv[0]);
			int v =Integer.parseInt(uv[1]);
			
			list.get(u).add(v);
			list.get(v).add(u);
		}
		
		Queue<Integer> q = new LinkedList<>();
		boolean [] checked = new boolean[N+1];
		int ans = 0; //변화횠수 카운트
		int tree_cnt=0;
		
		for(int i=1; i<=N; i++) {
			if(!checked[i]) {
				tree_cnt++;
				q.add(i);
				checked[i]= true;
				int node = 1;
				int edge = 0;
				while(!q.isEmpty()) {
					int now = q.poll();
					for(int j=0; j<list.get(now).size(); j++) {
						if(!checked[list.get(now).get(j)]) {
							q.add(list.get(now).get(j));
							checked[list.get(now).get(j)]= true;
							node++;
							edge++;
						}else {
							edge++;
						}
					}
				}
				ans += Math.abs(node-(edge/2+1));
				
			}
		}
		ans+=tree_cnt-1;
		System.out.println(ans);
	}

}
