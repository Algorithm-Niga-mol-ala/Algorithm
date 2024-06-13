import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String [] NMk = br.readLine().split(" ");
		int N = Integer.parseInt(NMk[0]);
		int M = Integer.parseInt(NMk[1]);
		int k = Integer.parseInt(NMk[2]);
		
		String [] fee_arr = br.readLine().split(" ");
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		for(int i=0; i<=N; i++) {
			list.add(new ArrayList<Integer>());
		}
		int [] fee = new int [N+1];
		
		for(int i=1; i<=N;i++) {
			fee[i] = Integer.parseInt(fee_arr[i-1]);
		}
		
		for(int i=0; i<M; i++) {
			String []vw = br.readLine().split(" ");
			int v = Integer.parseInt(vw[0]);
			int w = Integer.parseInt(vw[1]);
			list.get(v).add(w);
			list.get(w).add(v);
		}
		
		boolean [] checked = new boolean[N+1];
		int total = 0;
		for(int i=1; i<=N; i++) {
			if(checked[i]) continue;
			int min = 10001;
			Queue<Integer> q = new LinkedList<>();
			q.add(i);
			
			while(!q.isEmpty()) {
				int now = q.poll();
				min = Math.min(min, fee[now]);
				checked[now] = true;
				for(int j=0; j<list.get(now).size(); j++) {
					if(checked[list.get(now).get(j)]) continue;
					q.add(list.get(now).get(j));
				}
			}
			total += min; 
			
		}
		if(total<=k) System.out.println(total);
		else {
			System.out.println("Oh no");
		}
	}

}
