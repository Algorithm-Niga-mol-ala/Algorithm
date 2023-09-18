import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main25501_재귀의귀재 {
	static int cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringBuilder sb = new StringBuilder();
			cnt = 1;
			String[] arr = br.readLine().split("");

			sb.append(recursion(arr, 0, arr.length - 1)).append(" ").append(cnt);
			System.out.println(sb);
		}
		br.close();
	} // main

	public static int recursion(String[] arr, int st, int ed) {
		// 기저조건
		if (st >= ed)
			return 1;
		// 재귀조건
		else {
			if (!arr[st].equals(arr[ed])) {
				return 0;
			} else {
				cnt++;
				return recursion(arr, st + 1, ed - 1);
			}
		}
	} // recursion
}
