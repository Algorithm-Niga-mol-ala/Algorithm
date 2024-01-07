import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main8958_OX퀴즈 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 색종이 수

		for (int i = 0; i < N; i++) {
			String[] arr = br.readLine().split("");
//			System.out.println(Arrays.toString(arr));

			int[] cnt = new int[arr.length]; // O면 1 카운팅 해주는 배열
			int[] sum = new int[cnt.length]; // 점수 구해주기 위한 배열
			int ans = 0; // 점수 총합

			for (int j = 0; j < cnt.length; j++) {
				if (arr[j].equals("O"))
					cnt[j]++;
			} // j for
//			System.out.println("cnt: " + Arrays.toString(cnt));

//			1 1 0 0 1 1 0 0 1 1
//			1 2 0 0 1 2 0 0 1 2 = 9

			for (int j = 0; j < sum.length; j++) {
				if (j == 0)
					sum[0] = cnt[0];
				else {
					if (cnt[j] == 1)
						sum[j] = cnt[j] + sum[j - 1];
				}
			} // j for
//			System.out.println("sum: " + Arrays.toString(sum));

			for (int j = 0; j < sum.length; j++) {
				ans += sum[j];
			}

			System.out.println(ans);
		} // i for

	} // main

}
