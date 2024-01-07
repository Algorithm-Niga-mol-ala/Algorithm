import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int S = sc.nextInt(); // 스위치의 개수
		int[] swi = new int[S + 1];

		for (int i = 1; i < S + 1; i++) {
			swi[i] = sc.nextInt();
		} // 스위치의 상태 입력받음

//		System.out.println(Arrays.toString(swi));

		int N = sc.nextInt(); // 학생의 수

		for (int i = 0; i < N; i++) {

			int gender = sc.nextInt(); // 학생의 성별
			int num = sc.nextInt(); // 번호

			switch (gender) {

			// 남학생
			case 1:

				// 스위치 번호 1번부터 끝까지 돌면서
				for (int j = 1; j < S + 1; j++) {

					if (j % num == 0) { // 인덱스가 num의 배수라면 값을 바꿔줌
						swi[j] = (swi[j] == 0) ? 1 : 0;
					} else
						continue; // num의 배수가 아니면 넘어감
				}

				break;
			// 여학생
			case 2:

				// 양쪽 대칭에 상관없이 일단 배정받은 번호 스위치 상태 바꿔줌
				swi[num] = (swi[num] == 0) ? 1 : 0;

				int k = 0; // 거리를 하나씩 증가시킬 변수
				while (num - k >= 1 && num + k < S + 1 && swi[num - k] == swi[num + k]) {
					// 배열의 범위를 벗어나지 않고 대칭되는 두 값이 같으면

					// 대칭되는 값들 바꿔줌
					swi[num - k] = (swi[num - k] == 0) ? 1 : 0;
					swi[num + k] = (swi[num + k] == 1) ? 0 : 1;

					k++;
				}

				break;

			}// switch

		} // 학생의 성별, 번호 입력 받는 for문

		if (S + 1 > 20) {
			for (int a = 0; a <= (S + 1) / 20; a++) {
				for (int b = 1; b <= 20; b++) {
					if (b + (20 * a) >= S + 1) {
						break;
					}
					System.out.print(swi[b + (20 * a)] + " ");
				}
				System.out.println();
			}
		} else {
			for (int a = 1; a < S + 1; a++) {
				System.out.print(swi[a] + " ");
			}
		}

	}// main

}
