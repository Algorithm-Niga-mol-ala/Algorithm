import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main1026_보물 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		} // 입력 끝

		// 작은수 * 큰 수 로 해야 제일 최소값을 얻을 수 있음
		// a를 순열로 만들어서 b랑 일일이 곱하는 거나 b도 배열해서 곱하는 거나 결국 같은 경우임
		Arrays.sort(a);
		Arrays.sort(b, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (a[i] * b[i]);
		}

		System.out.println(sum);
	} // main

}
