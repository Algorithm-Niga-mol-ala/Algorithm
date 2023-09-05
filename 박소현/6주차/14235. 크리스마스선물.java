package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine()); // 방문 횟수

		// 우선순위 큐 내림차순 정렬 (큰 값부터 뽑아내야 하므로!!!!!!!!)
		PriorityQueue<Integer> present = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // 선물 개수. 0이라면 아이들을 만난 것

			if (a != 0) { // 선물이 있다면 우선순위 큐에 담아줌
				for (int j = 0; j < a; j++) {
					int value = Integer.parseInt(st.nextToken());
					present.add(value);
				}
			} else { // 선물이 없고 아이들을 만났다면
				if (!present.isEmpty()) { // 큐에 원소가 있으면 큰 값부터 자동출력
					System.out.println(present.remove());
				} else // 큐가 비었으면 -1
					System.out.println(-1);
			}
		} // i for
	} // main

}
