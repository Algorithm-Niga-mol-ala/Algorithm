
import java.util.Scanner;

public class Day_0731_03 {
	public static void main(String[] args) {

		// 첫째줄에는 별 1개 둘째줄에는 3개 N번째 줄에는 2*N-1개
		// 가운데를 기준으로 대칭

		//대칭이니까  " " 먼저 n-i개 찍고 *을 2n-1개 찍고 " " 을 또,,,?
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < 2*n-1; k++) {
					System.out.print("*");
			}
		}System.out.println();
		
		//내일 마저 할게요.............죽겠어요..............

	}

}
