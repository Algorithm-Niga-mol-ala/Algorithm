
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  //참 싫다 이문제...!

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine()); // 원판의 개수

		System.out.println((int) (Math.pow(2, N) - 1));
		// 제곱함수 쓰기

		move(N, 1, 3); // 1번 기둥에 쌓인 N개의 원판을 3번 기둥으로 옮긴다
		bw.flush();
		bw.close();

	}// main

	// 장대(기둥)는 항상 1, 2, 3 => 합치면 6
	// 6 = a(시작기둥) + b(중간기둥) + c(종료기둥)
	// b(중간기둥) = 6 - a(시작기둥)- c(종료기둥)

	// n개의 원반을 a기둥에서 c기둥으로 옮기겠다
	static void move(int n, int a, int c) throws IOException {

		// n이 1일 때는 위에 원판이 없으니까(원반이1개) 재귀가 필요 없음
		if (n > 1) {
			// 맨 밑의 원판 제외하고 위에있는 원판 모두 중간기둥으로 이동
			move(n - 1, a, 6 - a - c);
		}
//		System.out.printf("%d %d\n", a, c);
		bw.write(a + " " + c + "\n");

		if (n > 1) {
			// 중간기둥에서 종료기둥으로 이동
			move(n - 1, 6 - a - c, c);
		}

	}// move

}// class
