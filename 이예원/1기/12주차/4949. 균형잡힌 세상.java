import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj_4949_균형잡힌세상 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Character> stack = new Stack<>();

		loop: while (true) {

			stack.clear(); // 전 문장 때문에 남아있는 요소 있으면 안되니까 비우기

			String str = br.readLine(); // 한 문장 입력받기

			if (str.equals("."))
				break; // "." 하나만 들어오면 종료

			for (int i = 0; i < str.length(); i++) { // 문장의 길이 동안

				char element = str.charAt(i); // 문장의 요소 하나 꺼내서

				if (element == ('(') || element == ('[')) { // 여는 괄호일 때
					stack.push(element);

				} else if (element == ')') { // 닫는 괄호 ')'

					// 스택이 비어있지 않을 때
					if (!stack.isEmpty()) {
						// 맨 위의 요소가 (라면
						if (stack.peek() == '(')
							stack.pop(); // 꺼내기
						else {
							System.out.println("no");
							continue loop;
						}

					} else {// 스택이 비어있다면 균형이 맞지 않음
						System.out.println("no");
						continue loop;
					}

				} else if (element == ']') {

					// 스택이 비어있지 않을 때
					if (!stack.isEmpty()) {
						// 맨 위의 요소가 [라면
						if (stack.peek() == '[')
							stack.pop();
						else {
							System.out.println("no");
							continue loop;
						}

					} else {
						System.out.println("no");
						continue loop;
					}
				}

			}

			if (stack.isEmpty()) {
				System.out.println("yes");
			} else
				System.out.println("no");
		}

	}// main
}
