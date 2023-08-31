package algo;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class bj_14235 {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //큰 선물이 먼저 나가야하므로 

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 아이들과 거점지를 방문한 횟수
		for (int i = 0; i < N; i++) {
			int newNum = sc.nextInt();
			if (newNum == 0) { // 아이들이라면
				if (pq.isEmpty())
					System.out.println(-1); //줄 선물이 없다면 -1 출력
				else
					System.out.println(pq.poll()); // 가장 큰 선물을 출력

			} else { // 선물 충전소라면
				for (int j = 0; j < newNum; j++) { //선물 개수만큼 반복
					pq.add(sc.nextInt()); // 충전한 선물을 우선순위 큐에 넣는다.
				}
			}
		}

	}

}
