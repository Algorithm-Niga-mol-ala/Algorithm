import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		Queue<Integer> queue = new LinkedList<>();

		int last = 0; // 맨 뒤 요소 출력을 위한 변수
		for (int tc = 1; tc <= T; tc++) {

			st = new StringTokenizer(br.readLine(), " ");

			String com = st.nextToken();

			if (com.equals("push")) { // push

				int num = Integer.parseInt(st.nextToken());

				queue.offer(num);

				last = num; // 맨 마지막에 push한 값 설정

			} else if (com.equals("pop")) { // pop

				if (!queue.isEmpty()) {
					System.out.println(queue.peek());
					queue.poll();
				} else
					System.out.println(-1);

			} else if (com.equals("size")) { // size
				System.out.println(queue.size());

			} else if (com.equals("empty")) { // empty

				if (!queue.isEmpty())
					System.out.println(0);
				else
					System.out.println(1);

			} else if (com.equals("front")) { // front

				if (!queue.isEmpty())
					System.out.println(queue.peek());
				else
					System.out.println(-1);

			} else { // back

				if (!queue.isEmpty())
					System.out.println(last);
				else
					System.out.println(-1);
			}

		} // tc

	}
}
