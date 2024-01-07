import java.util.Scanner;
import java.util.Stack;

public class Main9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 문자열 개수

		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next(); // 괄호 문자열 입력받기
			char[] arr = new char[str.length()]; // 입력받은 문자열 넣어줄 배열
			Stack<Character> small = new Stack<>();

			for (int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i); // 배열에 문자열 쪼개서 넣어줌

				if (arr[i] == '(') // (이면 push
					small.push(arr[i]);
				else { // )이면 pop
					if (!small.isEmpty() && small.peek()=='(')
						small.pop();
					else
						small.push(arr[i]);
				}
			}

			if (small.isEmpty())
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}
}
