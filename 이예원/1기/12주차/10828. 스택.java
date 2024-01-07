import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();
		for (int tc = 1; tc <= T; tc++) {

			st = new StringTokenizer(br.readLine(), " ");

			String com = st.nextToken();

			if (com.equals("push")) {// push
				int num = Integer.parseInt(st.nextToken());

				stack.push(num);

			} else if (com.equals("pop")) {// pop
				if (!stack.isEmpty()) {
					System.out.println(stack.peek());
					stack.pop();
				} else {
					System.out.println(-1);
				}
			} else if (com.equals("size")) {// size
				System.out.println(stack.size());

			} else if (com.equals("empty")) {// empty
				if (!stack.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(1);
				}

			} else {// top
				if (!stack.isEmpty()) {
					System.out.println(stack.peek());
				} else {
					System.out.println(-1);
				}
			}

		} // tc

	}
}
