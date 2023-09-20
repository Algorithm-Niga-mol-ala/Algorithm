import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main1197_최소스패닝트리 {
	static int[] p;
	static long x, y, w;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());

		long[][] info = new long[E][3];
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			info[i][0] = Long.parseLong(st.nextToken()); // 시작점
			info[i][1] = Long.parseLong(st.nextToken()); // 시작점
			info[i][2] = Long.parseLong(st.nextToken()); // 시작점
//			y = info[i][1] = Double.parseDouble(st.nextToken()); // 시작점
//			w = info[i][2] = Double.parseDouble(st.nextToken()); // 시작점
		}
//		System.out.println(Arrays.deepToString(info));

		// 가중치 오름차순으로 정렬
		Arrays.sort(info, new Comparator<long[]>() {
			@Override
			public int compare(long[] o1, long[] o2) {
				return Long.compare(o1[2], o2[2]);
			}
		});
		System.out.println(Arrays.deepToString(info));

		// makeset
		p = new int[V + 1];
		for (int j = 1; j < V + 1; j++) {
			p[j] = j;
		}

		// 대표자가 다르면 바꿔주자
		// 간선의 개수가 V-1개일 때까지 뽑자
		int sum = 0; // 가중치의 합
		int cnt = 0; // 간선의 개수
		for (int i = 0; i < E; i++) {
			int x = (int) info[i][0];
			int y = (int) info[i][1];
			int w = (int) info[i][2];
			if (findset(x) != findset(y)) {
				union(x, y);
				sum += w;
				cnt++;
			}
			if (cnt == V - 1) {
				break;
			}

		}

		System.out.println(sum);
	} // main

	public static int findset(int x) {
		if (x != p[(int) x])
			p[(int) x] = findset(p[(int) x]);
		return p[(int) x];
	} // findset

	public static void union(int x, int y) {
		p[findset(y)] = p[findset(x)];
	} // union
}
