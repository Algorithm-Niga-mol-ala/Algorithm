import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	static ArrayList<ArrayList<int[]>> list;
	static final int DEFAULT_INTEEGER = 200000000;
	static int[] dist;
	static int N, E;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] NE = br.readLine().split(" ");
		N = Integer.parseInt(NE[0]);
		E = Integer.parseInt(NE[1]);

		list = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<int[]>());
		}

		for (int i = 0; i < E; i++) {
			String[] row = br.readLine().split(" ");
			int a = Integer.parseInt(row[0]);
			int b = Integer.parseInt(row[1]);
			int c = Integer.parseInt(row[2]);

			list.get(a).add(new int[] { b, c });
			list.get(b).add(new int[] { a, c });
		}
		String[] target = br.readLine().split(" ");
		int v1 = Integer.parseInt(target[0]);
		int v2 = Integer.parseInt(target[1]);

		dist = new int[N + 1];
		int ans1 = 0;
		ans1 += dijkstra(1, v1);
		ans1 += dijkstra(v1, v2);
		ans1 += dijkstra(v2, N);
		int ans2 = 0;
		ans2 += dijkstra(1, v2);
		ans2 += dijkstra(v2, v1);
		ans2 += dijkstra(v1, N);
		
		int ans = ans1>= DEFAULT_INTEEGER&& ans2>= DEFAULT_INTEEGER? -1: Math.min(ans1, ans2);
		
		System.out.println(ans);
	}

	private static int dijkstra(int st, int ed) {
		Arrays.fill(dist, DEFAULT_INTEEGER);

		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((s1,s2)->(s1[1]-s2[1]));
		boolean[] visited = new boolean[N + 1];
		pq.add(new int[] { st, 0 });
		dist[st] = 0;

		while (!pq.isEmpty()) {
			int[] now = pq.poll();

			if (visited[now[0]])
				continue;

			visited[now[0]] = true;

			for (int i = 0; i < list.get(now[0]).size(); i++) {
				int[] arr = list.get(now[0]).get(i);
				if (dist[arr[0]] > dist[now[0]] + arr[1]) {
					dist[arr[0]] = dist[now[0]] + arr[1];
					pq.add(new int[] {list.get(now[0]).get(i)[0],dist[arr[0]]});
				}
			}
		}
		return dist[ed];
	}

}
