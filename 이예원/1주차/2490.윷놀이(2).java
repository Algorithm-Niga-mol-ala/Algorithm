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

		int[] arr = new int[4]; // 카운트 된 숫자를 담을 배열

		int cnt = 0;

		for (int i = 0; i < 3; i++) {
			cnt = 0;
			for(int j = 0; j < 4; j++) {
				arr[j] = sc.nextInt();
				if (arr[j] == 1) {
					cnt++;
				}
			}

			if (cnt == 3) {
				System.out.println("A");
			} else if (cnt == 2) {
				System.out.println("B");
			} else if (cnt == 1) {
				System.out.println("C");
			} else if (cnt == 0) {
				System.out.println("D");
			} else {
				System.out.println("E");
			}
		}

	}
}
