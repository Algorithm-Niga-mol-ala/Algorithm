package algo;

import java.util.Scanner;

public class bj_10994 {

	public static String[][] map;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = 4 * N - 3; //가장 큰 한 변의 길이

		map = new String[M][M];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < M; j++) {
				map[i][j] = " ";
			}
		}

		printStar(M, 0, M-1);
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < M; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println("");
		}
	}

	public static void printStar(int m, int stPoint, int edPoint) {

		if (m == -1)
			return;

		for (int i = stPoint; i <= edPoint; i++) {
			map[stPoint][i] = "*";
			map[i][stPoint] = "*";
			map[edPoint][i] = "*";
			map[i][edPoint] = "*";
		}
		
		printStar(m-1, stPoint + 2, edPoint - 2);
	}

}
