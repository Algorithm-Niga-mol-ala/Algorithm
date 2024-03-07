package java23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<edge> pq = new PriorityQueue<>((o1, o2)-> o1.cost - o2.cost);
		List<List<edge>> list = new ArrayList<>();
		
		for(int i=0; i<=N; i++) {
			list.add(new ArrayList<edge>());
		}
		
		for(int i=1; i<=N; i++) {
			int cost = Integer.parseInt(br.readLine());
			pq.add(new edge(i,cost));
		}
		for(int i=1; i<=N; i++) {
			String [] row = br.readLine().split(" ",0);
			for(int j=1; j<=N; j++) {
				if(i==j) continue;
				int cost = Integer.parseInt(row[j-1]);
				list.get(i).add(new edge(j,cost));
			}
		}
		boolean[] checked = new boolean[N+1];
		int ans = 0;
		int cnt = 0;
		while(!pq.isEmpty()) {
			edge now = pq.poll();
			if(checked[now.ed]) continue;
			checked[now.ed] = true;
			cnt++;
			ans += now.cost;
			if(cnt==N) {
				break;
			}
			for(int i=0; i<list.get(now.ed).size(); i++) {
				if(!checked[list.get(now.ed).get(i).ed]) {
					pq.add(list.get(now.ed).get(i));
				}
			}
			
		}
		System.out.println(ans);
	}
}

class edge{
	int ed;
	int cost;
	
	edge(int ed, int cost){
		this.ed = ed;
		this.cost = cost;
	}
	
	
	
	
}
