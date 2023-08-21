package algo;

import java.util.Scanner;

public class bj1244 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 스위치 개수
		int N = sc.nextInt();

		// 스위치 상태
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int studentN = sc.nextInt();
		for (int s = 0; s < studentN; s++) {
			int gender = sc.nextInt();
			int num = sc.nextInt();
			switch (gender) {
			case 1:
				for (int i = 0; i < N; i++) {
					if ((i + 1) % num == 0) {
						arr[i] = arr[i] == 0 ? 1 : 0;
					}
				}
				break;
			case 2:
				arr[num - 1] = arr[num - 1] == 0 ? 1 : 0;
				int i = 1;
				while (num - 1 - i >= 0 && num - 1 + i < N && arr[num - 1 - i] == arr[num - 1 + i]) {
					arr[num - 1 - i] = arr[num - 1 - i] == 0 ? 1 : 0;
					arr[num - 1 + i] = arr[num - 1 + i] == 0 ? 1 : 0;
					i++;
				}
				break;
			}

		}

		int cnt = 0;
		for (int n : arr) {
			if (cnt > 0 && cnt % 20 == 0)
				System.out.println("");
			System.out.print(n + " ");
			cnt++;
		}
	}

}
