import java.util.Arrays;
import java.util.Scanner;

public class Main_3052_나머지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0; // 나머지 개수 세는 변수
		int[] remain = new int[42]; // 나머지 0~41을 담을 배열

		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();

			int num = n % 42; // 나머지
			for (int j = 0; j < remain.length; j++) {
				if (j == num) // 나머지가 나오면 배열에 +1씩 카운팅
					remain[j]++;
			}

		} // i for
		
		// 카운팅이 끝난 뒤에 0보다 크면 카운팅해줄 것이므로 i for문 밖에 나와야 함
		for (int j = 0; j < remain.length; j++) {
			if (remain[j] > 0) // 배열의 요소가 있으면 +1씩 카운팅
				cnt += 1;
		}

//		System.out.println(Arrays.toString(remain)); // 확인용
		
		// 출력
		System.out.println(cnt);

	}// main

}
