
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 스택만들기
		Stack<String> stack = new Stack<>();

		// 일단 tc T 를 먼저 입력 받자~!
		int T = Integer.parseInt(br.readLine());

		// 입력은 스페이스를 기준으로 한 문장씩 받아질거야

		for (int tc = 1; tc <= T; tc++) {

			String str = br.readLine(); // 문장입력

			String[] word = str.split(" "); // 공백 기준으로 잘라서 저장하기

			for (int i = 0; i < word.length; i++) {

				stack.push(word[i]);

			}

			int size = stack.size();
			System.out.print("Case #" + tc + ": ");
			for (int j = 0; j < size; j++) { // stack의 크기만큼 pop

				System.out.print(stack.pop() + " ");
			}
			System.out.println();
		} // 전체 tc 도는 for문

	} // main

}// class
