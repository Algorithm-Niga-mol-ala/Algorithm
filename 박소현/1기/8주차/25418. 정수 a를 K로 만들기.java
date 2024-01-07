import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main25418_정수a를K로만들기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		// 연산1 : a+1
		// 연산2 : a*2
		// 곱하기 연산을 어느 순간에 해야할지 잘 모르겟음
		// 따라서 a를 연산해주는 것이 아니라 k에서부터 거꾸로 반대연산(나누기, 빼기)을 할 것!

		// 연산의 개수를 세줄 변수
		int cnt = 0;

		while (k != a) {
			// a = 3, k = 8일 경우
			// 8 4 2 1 0이 되므로 무한루프
			// k/2 >= a 조건이 필요함
			if (k % 2 == 0 && k / 2 >= a) {
				k = k / 2;
				cnt++;
			} else {
				k = k - 1;
				cnt++;
			}
		}
		System.out.println(cnt);
	} // main

}
