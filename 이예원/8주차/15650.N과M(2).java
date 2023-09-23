
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int M;
	static int[] arr; // 자연수 담을 배열

	public static void main(String[] args) throws IOException {
		// 자연수 N과 M이 주어졌을 때 , 길이가 M인 수열을 모두 구하기
		// 1~N까지의 자연수 중에서 중복 없이 M개를 고른 수열
		// 오름차순으로 출력

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[M];

		perm(1, 0);

	}// main

	static void perm(int now, int depth) {

		// 기저 조건
		// res배열에 M길이 만큼 수가 담겼을 때
		if (depth == M) {
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}

		// 재귀
		// 내가 전에 입력했던 수보다 하나 큰 수부터 시작
		// 그래서 굳이 방문체크 안해줘도 괜찮음
		// 깊이도 하나 더 들어감

		for (int i = now; i <= N; i++) {
			arr[depth] = i;

			perm(i + 1, depth + 1);

		}
	}// perm

}
