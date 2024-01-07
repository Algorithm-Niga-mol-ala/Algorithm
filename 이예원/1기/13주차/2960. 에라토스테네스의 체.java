import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_2960_에라토스테네스의체 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] arr = new int[N + 1]; // N+1 길이의 배열, 인덱스를 사용

		for (int i = 2; i < N + 1; i++) {
			arr[i] = i;
		} // 배열에 인덱스 값 넣어주기

//		System.out.println(Arrays.toString(arr));

		int cnt = 0;

		loop: for (int i = 2; i < N + 1; i++) {
			// 전체 배열 돌면서

			int j = 1;
			while (i * j < N + 1) { // i의 배수가 범위 안에 있는 동안

				if (arr[i * j] != 0) { // 지워지지 않은 수일 때만
					arr[i * j] = 0; // 지우기

					cnt++; // 지운 횟수 + 1
					if (cnt == K) {
						System.out.println(i * j);
						break loop;
					}
				}

				j++;

			}

		}
		// System.out.println(cnt);

	}// main

}
