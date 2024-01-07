
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int M;
	static int[] arr, res;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		/*
		 * 1부터 N까지 자연수 중에서 M개를 고른 수열 같은 수를 여러 번 골라도 된다.(방문체크 안해도 되겠다)
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N]; // 1~N을 담아줄 배열
		res = new int[M]; // 출력할 배열
		
		
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

			res[depth] = i + 1;
			perm(depth + 1);

		}

	}// perm

}// class
