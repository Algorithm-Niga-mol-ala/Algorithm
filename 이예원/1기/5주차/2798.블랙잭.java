
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// N장의 카드 중에서 3장을 뽑아 M을 넘지 않으면서 최대한 가까운 카드 3장의 합 구하기

		// 입력
		// 첫째줄에 카드의 개수 N와 M이 주어진다
		// 둘째줄에 카드에 쓰여있는 숫자가 주어진다

		// M을 넘지 않는 가장 가까운 3장의 합 출력

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] cards = new int[N];

		for (int i = 0; i < N; i++) {
			cards[i] = sc.nextInt();
		}

		// 여기까지 카드 값 다 받아옴

		// 3중 for문이면 되려나...?

		int res = 0;
    
		for (int i = 0; i < N - 2; i++) { //0번 인덱스부터
			for (int j = i + 1; j < N - 1; j++) { //i 바로 옆
				if (cards[i] + cards[j] <= M) { //두 수를 더했을 때 M을 넘지 않는다면
					for (int k = j + 1; k < N; k++) { //j 옆의 값도 같이 더해봄

						int sum = cards[i] + cards[j] + cards[k]; //세 개를 더한 값

						if (sum == M) { //M과 같으면 res에 대입하고 끝내기
							res = sum;
							break;
						} else if (sum < M && sum > res) { //M보다 작고 res보다 크다면 담아주기
							res = sum;
							continue;
						} else //M보다 크면 넘어가기
							continue;
					}
				}
			}
		}

		System.out.println(res);

	}

}
