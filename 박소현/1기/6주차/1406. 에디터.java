package week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static String order, letter;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		String[] sent = br.readLine().split(""); // 초기 문자열
		Stack<String> left = new Stack<>(); // 커서의 왼쪽에 있는 문자열
		Stack<String> right = new Stack<>(); // 커서의 오른쪽에 있는 문자열

		for (int i = 0; i < sent.length; i++) {
			left.push(sent[i]);
		} // 입력 끝 & left에 다 넣어주기
//		System.out.println(left.toString());

		int M = Integer.parseInt(br.readLine()); // 명령어의 개수
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			order = st.nextToken(); // 명령어
			if (order.equals("P")) { // P일 경우에만
				letter = st.nextToken(); // 추가할 문자열 입력받기
			}

			switch (order) {
			case "L":
				if (!left.isEmpty())
					right.push(left.pop());
				break;
			case "D":
				if (!right.isEmpty())
					left.push(right.pop());
				break;
			case "B":
				if (!left.isEmpty())
					left.pop();
				break;
			case "P":
				left.push(letter);
			} // switch

		}
		StringBuilder sb = new StringBuilder();
		// left는 i++로 출력해주기
		for (int i = 0; i < left.size(); i++) {
			sb.append(left.get(i));
		}
		 // abc로 left에 담겨있다가 right에는 cba로 담기기 때문에 출력은 i--로 해주기
		for (int i = right.size()-1; i>=0; i--) {
			sb.append(right.get(i));
		}
		bw.write(sb.toString());

		bw.close();
		br.close();
	} // main
}
