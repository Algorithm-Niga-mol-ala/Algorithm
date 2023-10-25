import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11050_이항계수1 {
  // 분자를 팩토리얼로 재귀 돌리니까 스택오버플로우 발생
  // 그냥 반복문 돌림... 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

    // 10C2 = 10C8 이니까 시간 줄이기 위함
		if (k > n / 2)
			k = n - k;

		int ans = 1;
		for (int i = 0; i < k; i++) { // 분모
			ans *= (n - i);
		}
		int divide = 1;
		for (int i = 1; i < k; i++) { // 분자
			divide *= (i + 1);
		}

		System.out.println(ans / divide);
	} // main

}
