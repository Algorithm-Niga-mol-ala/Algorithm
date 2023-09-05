import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// n개의 노드, m개의 리프로 이루어진 트리 만들기

		// 3 <= n <= 50, 2 <= m <= n-1

		// 출력 : 첫째 줄부터 n-1개의 줄에 트리의 간선정보 출력

		// 문제 이해하는 데 엄청 오래 걸림
		// 쉽게 생각하면 리프는 이어져있는 노드가 하나 밖에 없는 노드

		// m == 2 라면, 루트노드랑 맨 마지막 노드만 리프노드이기 때문에
		// n-1까지 나, 나+1 출력

		// m > 2라면
		// n-m개의 노드를 제외한 나머지 노드를 리프로 만들면 됨!

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 노드의 수
		int m = sc.nextInt(); // 리프의 수

		if (m == 2) {
			for (int i = 0; i < n - 1; i++) {
				System.out.println(i + " " + (i + 1));
			}
		} else { // m이 3 이상일 때 (예를 들어 n == 9, m == 6)
			for (int i = 0; i <= n - m; i++) {
				System.out.println(i + " " + (i + 1));
			} // 0부터 n-m 까지는 양쪽으로 연결 ( 0-1-2-3-4 )

			for (int j = n - m + 2; j <= n - 1; j++) {// 여기에서 j의 시작을 n-m+1로 하면 4는 이미 3에 연결되어 있기 때문에 중복출력됨
				System.out.println((n - m) + " " + j);
			}// n-m+2(5)부터 n-1(8)까지는 n-m (3)에 연결해주기
			// 0-1-2-3-4
//				  -5
//				  -6
//				  -7
//				  -8

		}

	}// main

}
