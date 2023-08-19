import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main11866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		sb.append("<");
		
		int N = sc.nextInt();
		int K = sc.nextInt();

		Queue<Integer> circle = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			circle.add(i);
		}

		// N개의 사람이 출력되야 하지만 출력 형식을 위해 N-1까지만 반복 돌려줌
		for (int i = 0; i < N-1; i++) {
			for (int j = 1; j < K; j++) { // K번째 사람을 제거해야 하므로
				circle.add(circle.poll());
			}
			sb.append(circle.poll() + ", ");
		}
		
		// 마지막 사람은 직접 출력
		sb.append(circle.peek()).append(">");
		
		System.out.println(sb);
	}

}
