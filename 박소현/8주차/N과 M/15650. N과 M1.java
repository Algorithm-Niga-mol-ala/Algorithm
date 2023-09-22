import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15649_N과M1 {
	static int[] arr, choose;
	static boolean[] visited;
	static int n, m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n]; // 1~n까지 담아줄 배열
		choose = new int[m]; // 길이가 m인 수열
		visited = new boolean[n]; // 방문처리

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		perm(0);

	} // main

	static void perm(int idx) {
		// m개 뽑으면 출력해주기!
		if (idx == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(choose[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < n; i++) {
			// 방문했으면 넘어가
			if (visited[i])
				continue;
			// 방문하지 않았으면 choose에 넣어주기 >.<
			choose[idx] = arr[i];
			visited[i] = true;
			perm(idx + 1); // 재귀 돌려~~~
			visited[i] = false; // 원상복귀 해줘야함 왜냐면 다음 턴에서도 또 선택될 수 있음
		}

	} // perm

}
