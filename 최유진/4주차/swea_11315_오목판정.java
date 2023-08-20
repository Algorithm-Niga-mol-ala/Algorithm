package algo;

import java.util.Scanner;

public class swea_11315 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			String[][] arr = new String[N][N];

			for (int i = 0; i < N; i++) {
				String[] lineArr = sc.next().split("");
				for (int j = 0; j < N; j++) {
					arr[i][j] = lineArr[j];
				}
			}

			boolean isPossible = false;

			check: for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j].equals("o")) {
						int d = 1;
						// 가로 확인.
						while (j + d < N && arr[i][j + d].equals("o")) {
							d++;
						}
						if (d >= 5) {
							isPossible = true;
							break check;
						}

						d = 1;
						// 세로 확인.
						while (i + d < N && arr[i + d][j].equals("o")) {
							d++;
						}
						if (d >= 5) {
							isPossible = true;
							break check;
						}

						d = 1;
						// 오른쪽 아래 확인.
						while (i + d < N && j + d < N && arr[i + d][j + d].equals("o")) {
							d++;
						}
						if (d >= 5) {
							isPossible = true;
							break check;
						}

						d = 1;
						// 왼쪽 아래 확인.
						while (i + d < N && j - d >= 0 && arr[i + d][j - d].equals("o")) {
							d++;
						}
						if (d >= 5) {
							isPossible = true;
							break check;
						}

					}
				}
			}

			if (isPossible) {
				System.out.printf("#%d YES", tc);
			} else {
				System.out.printf("#%d NO", tc);
			}
			System.out.println("");
		}

	}

}
