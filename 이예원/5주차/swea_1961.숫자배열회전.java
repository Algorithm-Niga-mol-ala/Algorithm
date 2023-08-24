
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 첫 줄에 T 입력 받고
		// 각 tc 첫번째 줄에 N
		// 다음 N 줄에는 N*N 행렬이 입력됨

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();

			int[][] board = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					board[i][j] = sc.nextInt();
				}
			} // 행렬 값 입력받기

			int[][] newBoard1 = new int[N][N]; // 90도회전배열
			int[][] newBoard2 = new int[N][N]; // 180도회전배열
			int[][] newBoard3 = new int[N][N]; // 270도회전배열

			// 90도
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					newBoard1[r][c] = board[N - 1 - c][r];
				}
			}

			// 180도
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					newBoard2[r][c] = board[N - 1 - r][N - 1 - c];
				}
			}

			// 270도
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					newBoard3[r][c] = board[c][N - 1 - r];
				}
			}

      // 이 부분 아직도 헷갈림 
			System.out.println("#" + tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(newBoard1[i][j]);

				}
				System.out.print(" ");

				for (int j = 0; j < N; j++) {
					System.out.print(newBoard2[i][j]);

				}
				System.out.print(" ");
				
				for(int j = 0; j < N; j++) {
					System.out.print(newBoard3[i][j]);
					
				}
				System.out.println();
			}
		
		} // tc반복 for문

	}

}
