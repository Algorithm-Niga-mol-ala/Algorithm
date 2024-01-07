import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static int[] nums, res;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// N개의 자연수 중 M개를 고른 수열
		// 중복 가능

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		nums = new int[N];
		res = new int[M];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(nums);

		perm(0);
		System.out.println(sb);

	}// main

	static void perm(int depth) {
		// 기저

		if (depth == M) {
			for (int i : res) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}

		// 재귀

		for (int i = 0; i < N; i++) {

			res[depth] = nums[i];
			perm(depth + 1);
		}

	}// perm

}// class
