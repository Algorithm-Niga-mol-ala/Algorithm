import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15649_N과M_1 {
	static int N, M;
	static int[] nums, result;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 1~N까지의 지연수
		M = Integer.parseInt(st.nextToken()); // 중복없이 M개 고르기

		nums = new int[N]; // 1~N까지의 수 담기
		for (int i = 0; i < N; i++) {
			nums[i] = i + 1;
		}
		result = new int[M]; // 중복없이 M개 고른 수열
		visited = new boolean[N]; // 골랐는지 안 골랐는지 판단
//		System.out.println(Arrays.toString(nums));

		perm(0);

		br.close();
	} // main

	public static void perm(int idx) {
		StringBuilder sb = new StringBuilder();
		if (idx == M) {
			for (int i = 0; i < M; i++) {
				sb.append(result[i] + " ");
			}
			System.out.println(sb.toString());
		}
		for (int i = 0; i < N; i++) {
			if (visited[i])
				continue;
			if (idx < M) { // 특정 개수만 뽑아서 순열 구하기위한 조건
				result[idx] = nums[i];
				visited[i] = true;
				perm(idx + 1);
				visited[i] = false;
			}
		}

	} // perm
}
