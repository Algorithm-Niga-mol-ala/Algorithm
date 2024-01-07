import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main13458_시험감독 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine()); // 시험장 수

		int[] person = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			person[i] = Integer.parseInt(st.nextToken()); // 시험장 별 응시자 수
		}

		st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken()); // 총감독관
		int c = Integer.parseInt(st.nextToken()); // 부감독관

//		System.out.println(n + " " + Arrays.toString(person) + " " + b + " " + c);

		// 시험장 수 * 응시자 수 = 최대 1조까지 가므로 long으로 선언 필수!!!!!!!!!!
		long ans = n; // 총감독관은 시험장 수만큼 필요하므로
		for (int i = 0; i < n; i++) {
			if (person[i] > b) {
				ans += Math.ceil((person[i] - b) / (c * 1.0));
			}
		}
		System.out.println(ans);
		br.close();

	} // main
}
