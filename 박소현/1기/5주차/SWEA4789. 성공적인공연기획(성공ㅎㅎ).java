import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_성공적인공연기획 {

	public static void main(String[] args) throws IOException {
		// i번째 숫자는 i-1명이 박수쳐야 박수를 침
		// 주어진 숫자가 110011일 경우
		// 첫번째 1은 0명이 박수칠 때 박수 침
		// 두번째 1은 1명이 박수칠 때 박수 침 -> 따라서 박수쳐
		// 그 다음 박수치는 1은 4-1=3명이 박수쳐야 박수 침 -> 사람 1명 고용
		// 다음 박수치는 1은 6-1=5명이 박수쳐야 박수 침 -> 사람 1명 고용
		// 총 2명 고용 => 0의 개수를 세면 됨 (X)
		// [반례] 3001 -> 고용 없이도 기립박수 가능

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String str = br.readLine();

			// 입력받은 숫자들 넣어줄 배열 생성
			int[] clap = new int[str.length()];

			for (int i = 0; i < clap.length; i++) {
				clap[i] = Integer.valueOf(str.charAt(i) - '0');
			}
//			System.out.println(Arrays.toString(clap));

			// 고용할 사람의 수
			int person = 0;

			// 누적합 담아줄 배열
			int[] cnt = new int[clap.length];
			cnt[0] = clap[0];
			for (int i = 1; i < cnt.length; i++) {
				cnt[i] += (cnt[i - 1] + clap[i]);
//				System.out.println(Arrays.toString(cnt));
				if (i > cnt[i - 1]) {
					person += i - cnt[i - 1];
					cnt[i] += i - cnt[i - 1];
				}
			}
			
			// 출력
			System.out.println("#" + tc + " " + person);

		} // tc for

	} // main

}
