import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main14567_선수과목 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());

		int[][] adj = new int[v + 1][v + 1];
		int[] degree = new int[v + 1];

		for (int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			adj[start][end]++;
			degree[end]++;
		} // 입력 끗

		Queue<Integer> q = new LinkedList<>();

		// 선수과목을 위한 배열 선언
		int[] ans = new int[v + 1];
		for (int i = 1; i < v + 1; i++) {
			ans[i] = 0;
		}
		for (int i = 1; i <= v; i++) {
			if (degree[i] == 0)
				q.add(i);
			ans[i]++; // 처음 차수가 0인 애들은 1학기만에 졸업 가능
		}

		while (!q.isEmpty()) {
			int t = q.poll();

			for (int i = 1; i <= v; i++) {
				if (adj[t][i] == 1) {
					degree[i]--;
					if (degree[i] == 0)// 새롭게 0이 된 애들을 큐에 넣어줘야 하므로 if문 안에 들어와야 함!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						q.add(i);
					// 1->2->3일 경우 3번 과목은 2번과목을 듣는데 필요한 학기+1학기
					// 2번과목의 학기만큼을 이미 갖고 들어와야 함
					ans[i] = ans[t];
					ans[i]++; // 한 학기 추가
				}
			}
		} // while
//		System.out.println(Arrays.toString(ans));
		for (int i = 1; i < v + 1; i++) {
			System.out.print(ans[i] + " ");
		}
	} // main
}
