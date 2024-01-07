import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	static int N;
	static StringBuilder sb;

	static int priority(char C) {//*/을 +-보다 먼저 계산해줘야함 ()는 특별한 경우니까 다른 수식과 반응하지 않게 제일 나중으로
		if (C == '+' || C == '-') {
			return 1;
		} else if (C == '*' || C == '/') {
			return 2;
		} else {// '(' 일 때
			return 0;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();

		String str = br.readLine();
		// 수식 입력 받음
		Stack<Character> st = new Stack<>();
		// 수식을 넣을 스택 생성
		for (int i = 0; i < str.length(); i++) {
			char now = str.charAt(i);
			
			if (now <= 'Z' && now >= 'A')
				sb.append(now); // 알파벳이면 sb에 그냥 넣음
			else {// +-*/() 일때
				if (now == '(')
					st.push(now);
				else if (now == ')') {
					while (!st.isEmpty()) {
						if(st.peek()=='(') {
							st.pop();
							break;
						}
						sb.append(st.pop());
					}
				} else {
					while (!st.isEmpty() && priority(now) <= priority(st.peek())) {
						sb.append(st.pop());
					}
					st.push(now);
				}
			}
		}
		while(!st.isEmpty()) {
			sb.append(st.pop());
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}

}
