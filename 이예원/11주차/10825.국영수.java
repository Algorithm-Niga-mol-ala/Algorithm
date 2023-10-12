
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static class Student implements Comparable<Student> {

		int kor;
		int eng;
		int mat;
		String name;

		public Student(int kor, int eng, int mat, String name) {
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
			this.name = name;
		}

		@Override
		public int compareTo(Student o) {

			// 국어점수가 같으면
			if (this.kor == o.kor) {
				// 영어점수도 같으면
				if (this.eng == o.eng) {
					// 수학점수도 같다면
					if (this.mat == o.mat) {

						// 이름 사전순으로 출력
						return this.name.compareTo(o.name);
					}
					// 수학 감소하는 순
					return o.mat - this.mat;
				}
				// 영어 증가하는 순
				return this.eng - o.eng;
			}
			// 국어 감소하는 순
			return o.kor - this.kor;

		}

	}

	public static void main(String[] args) throws IOException {

		// comparable 사용 시, 앞 - 뒤 계산 후 결과 값이 양수면 오름차순, 음수면 내림차순!

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Student> queue = new PriorityQueue<Student>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {

			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int mat = Integer.parseInt(st.nextToken());

			// 입력받는 값을 우선순위큐에 넣어줌
			queue.add(new Student(kor, eng, mat, name));

		}
		//큐에서 하나씩 뽑아서 출력
		while (!queue.isEmpty()) {
			Student now = queue.poll();
			sb.append(now.name).append("\n");
		}
		System.out.println(sb);

	}// main

}
