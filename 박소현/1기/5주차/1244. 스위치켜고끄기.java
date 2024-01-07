import java.util.Scanner;

public class Main1244_스위치켜고끄기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 스위치 개수

		int[] onoff = new int[N + 1];
		for (int i = 1; i < N + 1; i++) { // 스위치 번호를 헷갈리지 않기 위해 0~N까지 담음
			onoff[i] = sc.nextInt(); // 스위치 상태
		}

		int S = sc.nextInt(); // 학생 수
		for (int i = 0; i < S; i++) {
			int gender = sc.nextInt(); // 성별
			int sw = sc.nextInt(); // 받은 스위치 번호

			switch (gender) {
			case 1: // 남자면 sw 배수들 스위치 바꿈
				for (int j = 1; j < N + 1; j++) { // 스위치 번호는 1번부터이므로
					if (j % sw == 0)
						onoff[j] = (onoff[j] == 1 ? 0 : 1);
				}
				break;
			case 2: // 여자면 sw 양옆이 같을 경우 스위치 바꿈
				onoff[sw] = (onoff[sw] == 1 ? 0 : 1);
				int left = sw - 1;
				int right = sw + 1;

				while (left > 0 && right < N + 1) {
					if (onoff[left] == onoff[right]) {
						onoff[left] = (onoff[left] == 1 ? 0 : 1);
						onoff[right] = (onoff[right] == 1 ? 0 : 1);
						left--;
						right++;
					} else
						break;
				} // while
			} // switch
		} // for

		// 출력
		for (int i = 1; i < N + 1; i++) { // 1번부터 출력
			System.out.print(onoff[i] + " ");
			if (i % 20 == 0) // 20개마다 빈 줄 넣어주기
				System.out.println();

		}

	}
}
