import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {


	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());	
		int M = Integer.parseInt(br.readLine());	
		ArrayList<ArrayList<int []>> list = new ArrayList<>();
		for(int i=0; i<=N; i++) {
			list.add(new ArrayList<int[]>());
		}
		
		for(int i=0; i<M; i++) {
			
			String [] row = br.readLine().split(" ");
			int st = Integer.parseInt(row[0]);
			int ed = Integer.parseInt(row[1]);
			int dist = Integer.parseInt(row[2]);
			
			list.get(st).add(new int [] {ed,dist});
		}
		
		String [] SE = br.readLine().split(" ");
		int S = Integer.parseInt(SE[0]); 
		int E = Integer.parseInt(SE[1]); 
		
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((s1,s2)->(s1[1]-s2[1]));
		
		
		boolean [] checked = new boolean [N+1];
		int [] cost = new int [N+1];
		int default_int =100_000_000; 
		Arrays.fill(cost, default_int);
		cost[S] =0;
		
		pq.add(new int [] {S,0});
		while(!pq.isEmpty()) {
			int [] now = pq.poll();
			if(checked[now[0]]) continue;
			
			checked[now[0]] = true;
			
			for(int i=0; i<list.get(now[0]).size(); i++){
				if(cost[list.get(now[0]).get(i)[0]]>cost[now[0]]+list.get(now[0]).get(i)[1]) {
					cost[list.get(now[0]).get(i)[0]] = cost[now[0]]+list.get(now[0]).get(i)[1];
					pq.add(new int [] {list.get(now[0]).get(i)[0],cost[list.get(now[0]).get(i)[0]]});
					
				}
			}
		}
		System.out.println(cost[E]);
	}
	

}
