import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 배(0) 등(1)
		// 도 A - 0 1 1 1
		// 개 B - 0 0 1 1
		// 걸 C - 0 0 0 1
		// 윳 D - 0 0 0 0
		// 모 E - 1 1 1 1
		// 세번의 입력이 주어짐

		// 값을 입력받는 스캐너 생성
		Scanner sc = new Scanner(System.in);
		

		for (int i = 1; i <= 3; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			int sum = a + b + c + d;
			
			if (sum == 3) {
				System.out.println("A");
			} else if (sum == 2) {
				System.out.println("B");
			} else if (sum == 1) {
				System.out.println("C");
			} else if (sum == 0) {
				System.out.println("D");
			} else {
				System.out.println("E");
			}
			
		}

	}
}
