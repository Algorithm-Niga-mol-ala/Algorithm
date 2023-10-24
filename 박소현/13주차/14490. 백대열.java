import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main14490_백대열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), ":");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int gcd = 0; // 최대공약수
		for (int i = Math.min(n, m); i >= 1; i--) {
			if (n % i == 0 && m % i == 0) {
				gcd = i;
				break;
			}
		}
		
		// 최대공약수로 나눈 값들 출력
		System.out.println(n / gcd + ":" + m / gcd);

	} // main
}
