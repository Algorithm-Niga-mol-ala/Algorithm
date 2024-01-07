import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2810_컵홀더 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// 컵홀더 사용 가능한 사람 수
		int seat = 0;

		String[] arr = br.readLine().split("");

		// S -> S 개수
		// LL -> LL 쌍 개수 +1
		
		// 일단 S와 L이면 카운팅해주고 L일 경우에는 다음 좌석도 무조건 L이므로 i++로 뛰어넘기
		for (int i = 0; i < N; i++) {
			if (arr[i].equals("S"))
				seat++;
			else if (arr[i].equals("L")) {
				seat++;
				i++;
			}
		}

		// LL이 있다면 마지막에 +1 카운팅해주기
		for (int i = 0; i < N; i++) {
			if (arr[i].equals("L")) {
				seat++;
				break;
			}
		}
//		System.out.println(Arrays.toString(arr));

		// 출력
		System.out.println(seat);

	} // main

}
