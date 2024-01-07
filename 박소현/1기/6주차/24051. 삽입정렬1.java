package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main24051_삽입정렬1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] arr = new int[A];
		int[] sarr = new int[A];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int cnt = 0;

		// 삽입정렬을 해보자.
		for (int i = 1; i < A; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && key < arr[j]) {
				// 한번에 뒤로 밀기
				arr[j + 1] = arr[j];
				cnt++;
				j--;
				if (cnt == K) {
					System.out.println(arr[j + 1]);
				}
//				System.out.println(Arrays.toString(arr));
			}
			if (arr[j + 1] != key) { // 이게 중요!!!!!!!!!
				arr[j + 1] = key;
				cnt++;
			}
			if (cnt == K) {
				System.out.println(arr[j + 1]);
			}
//			System.out.println(Arrays.toString(arr));
		}

		if (cnt < K) {
			System.out.println(-1);
		}

	} // main
}
