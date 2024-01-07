import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static int[] res;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		//중복가능, 비내림차순

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		res = new int[M];

		perm(1, 0);
		System.out.println(sb);

	}// main

	static void perm(int now, int depth) {

		// 기저
		// res배열의 길이 만큼 요소가 다 들어갔을 때
		if (depth == M) {
			for (int i : res) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}

		// 재귀
		// now(내가 앞에 썼던 것 보다 값이 커야함)
		for (int i = now; i <= N; i++) {

			res[depth] = i;
			perm(i, depth + 1);

		}

	}// perm

}
