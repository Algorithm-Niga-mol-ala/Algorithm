import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static int[] nums, res;
	static boolean[] check;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		// N개의 자연수를 M길이의 순열
		// 중복 안돼

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		nums = new int[N];
		res = new int[M];
		check = new boolean[N];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(nums);

		perm(0, 0);
		System.out.println(sb);

	}// main

	static void perm(int now, int depth) {

		// 기저
		if (depth == M) {
			for (int i : res) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}

		// 재귀

		for (int i = now; i < N; i++) {

			if (check[i])
				continue;

			check[i] = true;
			res[depth] = nums[i];
			perm(i + 1, depth + 1);
			check[i] = false; // 다녀오면 방문처리 해제

		}

	}// perm

}
