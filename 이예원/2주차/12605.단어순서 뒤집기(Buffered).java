
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {

//문자열 여러개가 주어질 때 단어들을 반대 순서로 뒤집어라
//각 라인은 w개의 영단어로 이루어져 있고 총 L개의 알파벳을 가짐

//입력
//첫 행은 N, 전체 케이스의 개수
//N = 5
//1<=L<=25
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<String> stack = new Stack<>(); // 스택 만들기

		String N = br.readLine(); // 테스트케이스 입력

		// 여기에서 N을 int로 받으면 그 다음 엔터를 입력값으로 받아서
		// 처음 단어가 출력되지 않음!!!!!!!!!!!!!!

		int n = Integer.parseInt(N);

		// 그래서 String으로 입력받고 int로 바꿔줬는데 엔터는 입력값으로 안받지만
		// 출력을 하다말어!!!!!!!!!!!!!!!!
		// 대체 왜~~~~~~~~

		for (int tc = 1; tc <= n; tc++) { // 테스트케이스 1에서 N개까지의 큰 for문

//
			String str = br.readLine();

			String[] str2 = str.split(" ");
//			String[] str = br.readLine().split(" "); //문장을 입력받고 단어마다 나눠서 배열에 저장

			for (int i = 0; i < str2.length; i++) { // str2의 길이만큼 스택에 push
				stack.push(str2[i]);
			}

			int size = stack.size(); // 문제는.....스택사이즈였따

			System.out.print("Case #" + tc + ": ");
			for (int j = 0; j < size; j++) { // stack의 크기만큼 pop

				System.out.print(stack.pop() + " ");
			}
			System.out.println();

		} // 큰 for문

		bw.flush();
		bw.close();

	}
}
