import java.util.Scanner;

public class Main_2798_블랙잭 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 카드의 개수
		int M = sc.nextInt(); // 카드 번호

		// 입력받은 카드 번호들 담아줄 배열 생성
		int[] blackjack = new int[N];
		for (int i = 0; i < N; i++) {
			blackjack[i] = sc.nextInt();
		}

		int sum = 0;
		int ans = 0;

		// 입력받은 정수들 중 세 장을 중복없이 골라내기 위한 반복문
		for (int i = 0; i < N; i++) {
			for (int j = 1; j < N; j++) {
				if (i != j) {
					for (int k = 2; k < N; k++) {
						if (i != k && j != k) {
							// 임의의 세 수의 합
							sum = blackjack[i] + blackjack[j] + blackjack[k];

							// ans보다 크고 블랙잭 M보다 작거나 같은 값을 얻기 위해
							if (ans < sum && sum <= M)
								ans = sum;
						}
					}
				}
			}
		} // for

		System.out.println(ans);
	}
}
