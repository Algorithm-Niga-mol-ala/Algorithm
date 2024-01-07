import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int[] nums; // 원소 담을 배열
	static int N;// 수열의 범위
	static int M;// 수열의 길이
	static boolean[] check; // 체크할배열
	static int[] res;// 수열 저장할 배열

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());

		M = Integer.parseInt(st.nextToken());

		nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = i + 1;
		} // 원소를 하나씩 담아준다 (1~N)

		check = new boolean[N];
		res = new int[M]; 

		perm(N, M, 0);

	}// main

	// idx는 현재 내가 판단하는 위치
	public static void perm(int N, int M, int depth) {
		// 재귀 깊이가 M과 같아지면 배열 출력
		if (depth == M) {
			for (int i : res) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}

		// 재귀파트
		// 사용할 수 있는 모든 원소 체크
		for (int i = 0; i < N; i++) {
			if (check[i])
				continue; // 이미 사용한 숫자라면 쳐낸다

			check[i] = true; // 해당 노드를 방문상태로 변경
			res[depth] = i + 1; // 해당 깊이를 인덱스로 i+1값 저장
			perm(N, M, depth + 1); // 다음 자식노드 방문을 위해 depth를 1 증가시키며 재귀

			// 다시 돌아오면 방문 안한 상태로 변경
			check[i] = false;
		}

	}// perm

}
