import java.util.Scanner;

public class Main2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextInt();

		int ans;

    // 계차수열 An = 3 * n(n - 1) >= N을 이용함
    // 3으로 나눌 것이므로 3보다 작은 1,2는 따로 조건문 설정
		if (N == 1) { // N == 1이면 자기 자신만 포함
			ans = 1;
			System.out.println(ans);
		} else if (N == 2) {
			ans = 2;
			System.out.println(ans);
		} else { // N >= 3
			for (int n = 1; n < N; n++) {
				if (n * (n - 1) >= Math.ceil((N - 1) / 3)) {
					ans = n;
					System.out.println(ans);
					break;
				}
			}
		}
	}
}
