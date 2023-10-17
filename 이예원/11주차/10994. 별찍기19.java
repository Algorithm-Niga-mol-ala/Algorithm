import java.util.Scanner;

public class Main {

	static char[][] star;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		N = 4 * N - 3;
		star = new char[N][N];

		// 일단 star 배열에 공백 채워주기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				star[i][j] = ' ';
			}
		}

		pointStar(0, N);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}

	}// main

	static void pointStar(int start, int len) {

		// 기저
		if (len <= start)
			return;

		// 재귀
		for (int i = start; i < len; i++) {

			// 제일 왼쪽 세로
			star[start][i] = '*';
			// 제일 오른쪽 세로줄
			star[i][len - 1] = '*';
			// 위 가로줄
			star[i][start] = '*';
			// 아래 가로줄
			star[len - 1][i] = '*';

		}

		pointStar(start + 2, len - 2);

	}
}
