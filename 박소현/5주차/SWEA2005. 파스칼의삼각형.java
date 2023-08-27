import java.util.Scanner;

public class Solution_파스칼의삼각형 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();

			// 파스칼의 삼각형 입력해줄 배열 생성
			int[][] pascal = new int[N][N];

			// 0번째 열과 i번째 행의 i번째 열은 무조건 1
			for (int i = 0; i < N; i++) {
				pascal[i][0] = 1;
				pascal[i][i] = 1;
			}

			// 파스칼의 삼각형 원리 적용
			for (int i = 1; i < N; i++) {
				for (int j = 1; j < N - 1; j++) {
					pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
				}
			}
			
			// 출력
			System.out.println("#" + tc);
			for(int i =0; i<N; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print(pascal[i][j] + " ");
				}
				System.out.println();
			}

		} // tc for
	}
}
