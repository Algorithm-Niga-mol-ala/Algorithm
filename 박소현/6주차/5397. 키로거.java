import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String str = br.readLine();
			char[] key = new char[str.length()];
			for (int i = 0; i < key.length; i++) {
				key[i] = str.charAt(i);
			}
//			System.out.println(Arrays.toString(key));

			Stack<Character> left = new Stack<>(); // 출력 위한 스택
			Stack<Character> right = new Stack<>(); // 커서 조정
			for (int i = 0; i < key.length; i++) {
				switch (key[i]) {
				case '<':
					if (!left.isEmpty())
						right.push(left.pop());
					break;
				case '>':
					if (!right.isEmpty())
						left.push(right.pop());
					break;
				case '-':
					if (!left.isEmpty())
						left.pop();
					break;
				default:
					left.push(key[i]);
				}
			} // 스택에 집어넣기

			StringBuilder sb = new StringBuilder();
			while (!left.isEmpty()) { // 왼쪽에 있는 것들을 다 오른쪽에 담음
				right.push(left.pop());
			}
			while (!right.isEmpty()) {
				sb.append(right.pop()); // 출력
			}
			System.out.println(sb.toString());

		} // tc
		br.close();
	} // main
}
