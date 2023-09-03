package algo;

import java.util.Scanner;

public class b14244 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // N개의 노
		int M = sc.nextInt(); // 차수가 1인 노드이 개수.

		for (int i = 0; i <= N - M - 1; i++) {
			System.out.println(i + " " + (i + 1));
		}

		for (int i = N - M + 1; i < N; i++) {
			System.out.println((N - M) + " " + i);
		}

	}

}
