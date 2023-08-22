package algo;

import java.util.Scanner;

public class bj2292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tmp = 1; // 범위
		int cnt = 1;
		while (N > tmp) {
			tmp += 6 * cnt;
			cnt++;
		}
		System.out.println(cnt);

	}

}
