import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// 스택! Last In First Out, 프링글스, 인터넷 브라우저 뒤로가기 앞으로가기

		// .push(input); : 스택에 input 값을 넣는다
		// .pop(); : 스택의 가장 위의 값을 리턴하는 동시에 제거
		// .peek(); : 스택의 가장 위에 있는 값을 리턴(top)
		// .isEmpty(); : 스택이 비어있으면 true, 아니면 false
		// .size(); : 스택이 가지고 있는 원소의 개수 출력

		// import 해줘야한다. import java.util.Stack;
		// 스택이 비어있을 때 .pop()과 .peek()를 사용하면 Exception 오류 발생

		// 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램 작성

		// push X : 정수 X를 스택에 넣는 연산
		// pop : 스택에서 가장 위에 있는 정수를 출력하고 뺀다. 정수가 없으면 -1출력
		// size : 스택에 들어있는 정수의 개수 출력
		// empty : 스택이 비어있으면 1, 아니면 0을 출력
		// top : 스택의 가장 위에 있는 정수 출력, 정수 없으면 -1 출력

		// 입력
		// 첫째 줄에 명령의 수 N이 주어진다.
		// 둘째 줄부터 N개의 줄에 명령이 하나씩 주어진다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()); // 명령의 수 n 입력받기

		int[] arr = new int[n]; // n길이의 배열 arr 생성

		Stack<Integer> stack = new Stack<>(); // int형 스택 선언

		for (int i = 0; i < arr.length; i++) {
			String word = br.readLine();

			int x = 0;
			if (word == "push x") {
				stack.push(x);
			} else if (word == "pop") {
				stack.pop();
			} else if (word == "size") {
				stack.size();
			} else if (word == "empty") {
				if (stack.isEmpty()) {
					bw.write(1);
				} else {
					bw.write(0);
				}
			} else if (word == "top") {
				stack.peek();
			}
		}

	}

}
