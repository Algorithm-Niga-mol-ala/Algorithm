import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();

		Queue<Integer> card = new LinkedList<Integer>();

		// 큐에 숫자 입력
		for (int i = 1; i <= N; i++) {
			card.add(i);
		}

		// 숫자 하나 버리고 숫자 하나 뒤로 넘기고 반복
		// 버릴 때마다 sb에 담아서 출력
		// 결국 출력되야 하는 숫자는 총 N개이므로 N번 반복 돌려줌
		for (int i = 0; i < N; i++) {
			if (!card.isEmpty()) {
				sb.append(card.poll() + " ");
			}
			card.add(card.poll());
		}
		
		// 출력
		System.out.println(sb);
	}
}
