import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj_2841_외계인의기타연주 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		//6개의 줄이니까 6개의 스택 (줄마다 따로 손가락을 움직여줘야함)
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		Stack<Integer> stack3 = new Stack<>();
		Stack<Integer> stack4 = new Stack<>();
		Stack<Integer> stack5 = new Stack<>();
		Stack<Integer> stack6 = new Stack<>();

		int cnt = 0;
		for (int i = 0; i < N; i++) {

			st = new StringTokenizer(br.readLine(), " ");

			int num = Integer.parseInt(st.nextToken()); //몇번줄인지
			int fret = Integer.parseInt(st.nextToken()); //몇번프렛인지

			switch (num) {
			case 1:
				if (!stack1.isEmpty()) {
					// 누르고 있는 음 중에 가장 높은 음이 프렛보다 작다면 push
					if (stack1.peek() < fret) {
						stack1.push(fret);
						cnt++;
						// 프렛보다 크다면
					} else if (stack1.peek() > fret) {

						// 프렛보다 큰 동안 pop
						while (!stack1.isEmpty() && stack1.peek() > fret) {
							stack1.pop();
							cnt++;
						}
            //pop 다하고 맨 위의 값이 나보다 작거나 스택이 비어있다면 push
						if (!stack1.isEmpty() && stack1.peek() < fret || stack1.isEmpty()) {
							stack1.push(fret);
							cnt++;
						} else
							break;
					} else
						break; // 같으면 넘어감

				} else {
					stack1.push(fret);
					cnt++;
				}

				break;

			case 2:
				if (!stack2.isEmpty()) {
					if (stack2.peek() < fret) {
						stack2.push(fret);
						cnt++;
					} else if (stack2.peek() > fret) {

						while (!stack2.isEmpty() && stack2.peek() > fret) {
							stack2.pop();
							cnt++;
						}

						if (!stack2.isEmpty() && stack2.peek() < fret || stack2.isEmpty()) {
							stack2.push(fret);
							cnt++;
						} else
							break;
					} else
						break;

				} else {
					stack2.push(fret);
					cnt++;
				}

				break;

			case 3:
				if (!stack3.isEmpty()) {
					if (stack3.peek() < fret) {
						stack3.push(fret);
						cnt++;
					} else if (stack3.peek() > fret) {

						while (!stack3.isEmpty() && stack3.peek() > fret) {
							stack3.pop();
							cnt++;
						}

						if (!stack3.isEmpty() && stack3.peek() < fret || stack3.isEmpty()) {
							stack3.push(fret);
							cnt++;
						} else
							break;
					} else
						break;

				} else {
					stack3.push(fret);
					cnt++;
				}

				break;

			case 4:
				if (!stack4.isEmpty()) {
					if (stack4.peek() < fret) {
						stack4.push(fret);
						cnt++;
					} else if (stack4.peek() > fret) {

						while (!stack4.isEmpty() && stack4.peek() > fret) {
							stack4.pop();
							cnt++;
						}

						if (!stack4.isEmpty() && stack4.peek() < fret || stack4.isEmpty()) {
							stack4.push(fret);
							cnt++;
						} else
							break;
					} else
						break;

				} else {
					stack4.push(fret);
					cnt++;
				}

				break;

			case 5:
				if (!stack5.isEmpty()) {
					if (stack5.peek() < fret) {
						stack5.push(fret);
						cnt++;
					} else if (stack5.peek() > fret) {

						while (!stack5.isEmpty() && stack5.peek() > fret) {
							stack5.pop();
							cnt++;
						}

						if (!stack5.isEmpty() && stack5.peek() < fret || stack5.isEmpty()) {
							stack5.push(fret);
							cnt++;
						} else
							break;
					} else
						break;

				} else {
					stack5.push(fret);
					cnt++;
				}

				break;
				
			case 6:
				if (!stack6.isEmpty()) {
					if (stack6.peek() < fret) {
						stack6.push(fret);
						cnt++;
					} else if (stack6.peek() > fret) {

						while (!stack6.isEmpty() && stack6.peek() > fret) {
							stack6.pop();
							cnt++;
						}

						if (!stack6.isEmpty() && stack6.peek() < fret || stack6.isEmpty()) {
							stack6.push(fret);
							cnt++;
						} else
							break;
					} else
						break;

				} else {
					stack6.push(fret);
					cnt++;
				}

				break;

			}// switch

		} // N개의 음

		System.out.println(cnt);
	}// main

}
