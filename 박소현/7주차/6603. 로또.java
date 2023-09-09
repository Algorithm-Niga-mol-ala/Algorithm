import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main6603_로또 {
	static int k;
	static int[] nums, result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while (true) { // 입력이 0일 때까지 무한루프
			st = new StringTokenizer(br.readLine());
			k = Integer.parseInt(st.nextToken());
			if (k == 0) // 입력이 0이면 루프 종료
				break;

			// 입력이 0이 아니면 루프 돌리자
			nums = new int[k];
			result = new int[6];
			for (int i = 0; i < k; i++) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			
			// k개 중 6개 고르는 방법 = 조합 & 오름차순으로 출력
			comb(0, 0);
			System.out.println();
		} // while

	} // main

	public static void comb(int idx, int sidx) {
		// 기저조건
		if (sidx == 6) {
			for (int i = 0; i < 6; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		// 재귀조건
		for (int i = idx; i <= k - 6 + sidx; i++) {
			result[sidx] = nums[i];
			comb(i + 1, sidx + 1);
		}
	} // comb
}
