import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main2252_줄세우기 {
	public static void main(String[] args) throws IOException {
		// 위상정렬 : 순서가 정해져있을 때 순서를 결정해주기 위한 방법(사이클이 없는 그래프=DAG의 순서를 나열하는 것)
		// 1. 차수가 0이면 큐에 넣어주기
		// 2. poll해주면서 그 점의 end점의 차수 낮춰주기
		// 3. 차수가 0인 새로운 점들 큐에 넣어주기 (반복반복~)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());

		List<Integer>[] list = new ArrayList[v + 1];
		int[] degree = new int[v + 1];
		for (int i = 1; i <= v; i++) {
			list[i] = new ArrayList<>();
		}
		for (int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			list[start].add(end);
			degree[end]++;
		} // 입력 끗

		Queue<Integer> q = new LinkedList<>();

		for (int i = 1; i <= v; i++) {
			if (degree[i] == 0)
				q.add(i);
		}

		while (!q.isEmpty()) {
			int t = q.poll();
			System.out.print(t + " ");

			// 1.
			for (int i = 0; i < list[t].size(); i++) {
				int eff = list[t].get(i);
				if (degree[eff] > 0)
					degree[eff]--;
				if (degree[eff] == 0)
					q.add(eff);
			}

			// 2.
			for (int i = 0; i < list[t].size(); i++) {
				int eff = list[t].get(i);
				if (--degree[eff] == 0)
					q.add(eff);
			}

			// 3.
			for (int k : list[t]) {
				if (--degree[k] == 0)
					q.add(k);
			}
		} // while

	} // main
}
