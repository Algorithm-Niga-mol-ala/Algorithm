
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 사람(배열)의 수

		int M = sc.nextInt(); // 게임을 끝낼 횟수

		int L = sc.nextInt(); // 공을 보낼 방향

		int[] ball = new int[N];

		ball[0] = 1; // 0번에 앉아 있는 사람은 공을 받고 시작
		int cnt = 0;

		// 몇 번 돌리게 될지 모르니까 while
		int idx = 0; // 0번 인덱스에서 시작
		while (ball[idx] < M) {
			if (ball[idx] % 2 != 0) { // 홀수일 때

				if (idx + L > N - 1) { // 인덱스 범위가 초과하면
					idx = idx - (N - L);
					ball[idx]++;

				} else { // 인덱스 초과 안하면
					ball[idx + L]++; // [idx+2]의 값 올려주기
					idx = idx + L;
				}
				cnt++;
			} else { // 짝수일 때

				if (idx - L < 0) { // 인덱스 범위 초과하면
					idx = idx + (N - L);
					ball[idx]++;

				} else { // 인덱스 초과 안하면
					ball[idx - L]++;
					idx = idx - L;
				}
				cnt++;
			}

		}

		System.out.println(cnt);

	}// main

}
