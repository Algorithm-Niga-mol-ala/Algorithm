
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	// 아이들에게 준 선물들의 가치를 출력, 선물을 주지 못했다면 -1

	// 입력
	// 첫번째 줄에 아이들과 거점지를 방문한 횟수 n
	// 다음 n줄에 a와 a개의 숫자가 주어지는데, a == 0 이라면 아이들을 만난 것(선물줘야함)
	// a != 0 이라면 a개의 선물을 충전하는 것, 숫자가 선물의 가치임
	// 선물은 항상 가치가 가장 큰 것부터 줌

	// 출력
	// a == 0 일 때마다 아이들에게 준 선물의 가치 출력하기
	// 준 선물이 없다면 -1 출력하기

	// 최대힙으로 구현 ( 최대힙이란 뭘까여? )

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		// 높은 순으로 우선순위 결정해야해서 reverseOrder메서드 사용

		int n = sc.nextInt(); // 방문 횟수 n

		for (int i = 0; i < n; i++) {

			int a = sc.nextInt();

			// 1. a == 0일 때
			if (a == 0) {
				if (pq.size() == 0) { // 큐의 사이즈가 0이면(선물이 없다면)
					System.out.println(-1);
				} else { // 선물이 있다면
					System.out.println(pq.peek()); // 가치가 높은 선물
					pq.remove(); // 출력 후 삭제
				}
			} else { // a != 0 일 때
				for (int k = 0; k < a; k++) { // a번 동안
					pq.add(sc.nextInt()); // 입력 값을 큐에 넣어주기
				}

			}

		}

	}// main

}
