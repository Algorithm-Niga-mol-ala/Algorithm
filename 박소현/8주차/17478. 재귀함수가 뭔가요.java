import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main17478_재귀함수가뭔가요 {
	static int N, cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());

		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		what(0, 0);

	} // main

	public static void what(int cnt, int repeat) {
		// 언더바를 출력해주기 위해 반복문
		// 0 4 8 순으로 증가하므로 repeat만큼 반복문 돌려줌 -> 처음 repeat = 0
		String underbar = "";
		for (int i = 0; i < repeat; i++) {
			underbar += "_";
		}
		// 기저조건
		if (cnt == N) {
			System.out.print(underbar);
			System.out.println("\"재귀함수가 뭔가요?\"");
			System.out.print(underbar);
			System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			System.out.print(underbar);
			System.out.println("라고 답변하였지.");
			return;
		}
		// 재귀조건
		System.out.print(underbar);
		System.out.println("\"재귀함수가 뭔가요?\"");
		System.out.print(underbar);
		System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
		System.out.print(underbar);
		System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
		System.out.print(underbar);
		System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

		// repeat은 4씩 증가하므로
		what(cnt + 1, repeat += 4);
		System.out.print(underbar);
		System.out.println("라고 답변하였지.");

	}
}
