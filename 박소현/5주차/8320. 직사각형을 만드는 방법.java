import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main8320_직사각형을만드는방법 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int i = 1;
		int cnt = 0;

		// 예를 들어 N = 12
		// 1*1 ~ 1*12, 2*2 ~ 2*6, 3*3~3*4 = 19개
		while (i * i <= N) {
			for (int j = i; j <= N; j++) {
				if (i * j <= N) {
//					System.out.println(i + "*" + j + "=" + i * j);
					cnt++;
				}
			}
			i++;
		}
		System.out.println(cnt);
	}
}
