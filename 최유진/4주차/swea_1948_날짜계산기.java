package algo;

import java.util.Scanner;

public class swea_1948 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] calendar = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int tc = 1; tc <= T; tc++) {
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();
			
			int answer = d2 - d1 + 1;
			
			for(int i = m1; i < m2; i++) {
				answer += calendar[i-1];
			}
			
			System.out.printf("#%d %d\n", tc, answer);
			
		}

	}

}
