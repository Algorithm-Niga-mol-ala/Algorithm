import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	static int V,E;
	static List<List<edge>> list;
	static int [] dist;
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] VE = br.readLine().split(" ",0);
		
		V = Integer.parseInt(VE[0]);
		E = Integer.parseInt(VE[1]);
		int st = Integer.parseInt(br.readLine());
		list = new ArrayList<>();
		for(int i=0; i<=V; i++) {
			list.add(new ArrayList<>());
		}
		for(int i=0; i<E; i++) {
			String [] SEW = br.readLine().split(" ",0);
			int S = Integer.parseInt(SEW[0]);
			int Ed = Integer.parseInt(SEW[1]);
			int W = Integer.parseInt(SEW[2]);
			list.get(S).add(new edge(Ed,W));
		}
		dist = new int [V+1];
		
		for(int i=0; i<=V; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[st]=0;
		
		dijkstra(st);
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=V; i++) {
			if(dist[i]!=Integer.MAX_VALUE) {
			sb.append(dist[i]).append("\n");
			}else {
				sb.append("INF").append("\n");
			}
		}
		System.out.println(sb.toString());
	}

	private static void dijkstra(int st) {
		PriorityQueue<edge> q = new PriorityQueue<>();
		boolean [] check = new boolean[V+1];
		
		q.add(new edge(st,0));
		
		while(!q.isEmpty()) {
			edge now = q.poll();
			
			int ed = now.ed;
			
			if(check[ed]) continue;
			check[ed] = true;
			
			for(edge e:list.get(ed)) {
				if(dist[e.ed]>dist[ed]+e.weight) {
					dist[e.ed] = dist[ed]+e.weight;
					q.add(new edge(e.ed, dist[e.ed]));
				}
			}
		}
	}
	
}
class edge implements Comparable<edge>{
	int ed;
	int weight;
	
	edge(int ed,int weight){
		this.ed = ed;
		this.weight = weight;
	}

	@Override
	public int compareTo(edge o) {
		// TODO Auto-generated method stub
		return this.weight-o.weight;
	}
}
