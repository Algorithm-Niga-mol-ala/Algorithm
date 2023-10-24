import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj_5430_AC {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		loop: for (int tc = 1; tc <= T; tc++) {

			Deque<Integer> deque = new LinkedList<>();

			String str = br.readLine();

			int comLen = str.length();

			String[] command = str.split(""); // 명령어 입력

			int N = Integer.parseInt(br.readLine());

			StringTokenizer st = new StringTokenizer(br.readLine(), "[],"); // 쪼개주기

			for (int i = 0; i < N; i++) {
				deque.offer(Integer.parseInt(st.nextToken()));
			} // 덱에 정수 넣기

			boolean flag = false; // false면 first, true면 last에서 꺼내기

			for (int i = 0; i < comLen; i++) {

				String now = command[i]; // 명령어 하나 꺼내서

				switch (now) {

				case "R": // R이 나올 때마다 flag 바꿔줌
					if (flag) {
						flag = false;
					} else {
						flag = true;
					}
					break;

				case "D":
					if (deque.isEmpty()) { // 덱이 비어있다면 error 출력 후 tc 넘어가기
						sb.append("error").append("\n");
						continue loop;

					} else {
						if (flag) { // last
							deque.pollLast();
						} else {
							deque.pollFirst();
						}
					}
					break;
				}// switch
			}

			sb.append("[");

			int size = deque.size();
			for (int i = 0; i < size; i++) {

				if (!flag) { // first
					sb.append(deque.pollFirst());
				} else { // last
					sb.append(deque.pollLast());
				}

				if (i != size - 1)
					sb.append(","); // 마지막 요소가 아니면 "," 붙여주기
			}

			sb.append("]").append("\n");
		} // tc
		System.out.println(sb.toString());
	}
}
