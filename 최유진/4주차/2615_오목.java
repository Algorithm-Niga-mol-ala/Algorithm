package algo;

import java.util.Scanner;

public class bj2165 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[19][19];

		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int winner = 0;
		int rNum = -1;
		int cNum = -1;

		check: for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				if (arr[i][j] != 0) {
					// 검은색인지 흰색인지 확인
					int color = arr[i][j];
					// 가로.
					int d = 1;
					// 0이 아니고 색깔돌이 나왔는데 그 다음 값들이 색깔돌과 같을
					while (j + d < 19 && arr[i][j + d] == color) {
						d++;
						if (d == 5 && (j + 5 >= 19 || (j + 5 < 19 && arr[i][j + 5] != color))) {
							if ((j - 1 >= 0 && arr[i][j - 1] == color)) {
								continue;
							}
							winner = color;
							rNum = i + 1;
							cNum = j + 1;
							break check;
						}
					}

					// 세로.
					d = 1;
					while (i + d < 19 && arr[i + d][j] == color) {
						d++;
						if (d == 5 && (i + 5 >= 19 || (i + 5 < 19 && arr[i + 5][j] != color))) {
							if ((i - 1 >= 0 && arr[i - 1][j] == color)) {
								continue;
							}
							winner = color;
							rNum = i + 1;
							cNum = j + 1;
							break check;

						}
					}

					// 오른쪽 아래.
					d = 1;
					while (i + d < 19 && j + d < 19 && arr[i + d][j + d] == color) {
						d++;
						if (d == 5 && (i + 5 >= 19 || j + 5 >= 19
								|| ((i + 5 < 19 && j + 5 < 19) && arr[i + 5][j + 5] != color))) {
							if (i - 1 >= 0 && j - 1 >= 0 && arr[i - 1][j - 1] == color) {
								continue;
							}
							winner = color;
							rNum = i + 1;
							cNum = j + 1;
							break check;
						}
					}

					// 왼쪽 아래.
					d = 1;
					while (i + d < 19 && j - d >= 0 && arr[i + d][j - d] == color) {
						d++;
						if (d == 5 && (i + 5 >= 19 || j - 5 < 0
								|| ((i + 5 < 19 && j - 5 >= 0) && arr[i + 5][j - 5] != color))) {
							if (i - 1 >= 0 && j + 1 < 19 && arr[i - 1][j + 1] == color) {
								continue;
							}
							winner = color;
							rNum = i + 4 + 1;
							cNum = j - 4 + 1;
							break check;
						}
					}

				}
			}
		}

		if (winner == 0) {
			System.out.println(winner);
		} else {
			System.out.println(winner);
			System.out.println(rNum + " " + cNum);
		}

	}

}
