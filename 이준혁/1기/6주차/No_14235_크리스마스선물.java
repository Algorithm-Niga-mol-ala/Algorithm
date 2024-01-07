package bj;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class No_14235_크리스마스선물 {

	public static void main(String[] args) {
		// 크리스마스에는 산타가 선물을 나눠준다. 
		// 첫 번째 줄에서는 아이들과 거점지를 방문한 횟수 n
		// 다음 줄에는 a개의 숫자가 들어오고, 그 숫자가 선물의 가치이다.
		// a가 0이라면 거점지가 아닌 아이들이다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

    // 우선순위큐 선언, 이후 Collections.reverseOrder를 사용하면 큰 수부터 우선하여 빠진다. 
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for (int i=0; i<n; i++) {
			int a = sc.nextInt(); // 입력을 받고,
			
			for (int j=0; j<a; j++) { // 그 입력이 1 이상이면 for문 사용
				pQ.add(sc.nextInt()); // 우선순위 큐에 입력값을 add한다.
			}
			
			if (a == 0 && pQ.isEmpty()) { // a가 0이고, pQ가 비어있다면
				System.out.println(-1); // -1 출력
			} else if (a == 0 && ! pQ.isEmpty()) { // a가 0이고, pQ에 내용물이 있다면
				System.out.println(pQ.poll()); // poll한 값을 출력 
			}
		}
	}
}
