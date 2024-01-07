
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다
		// 그 다음 서로 다른 값이 몇 개 있는지 출력

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10]; // 원본 값을 담을 배열
		int[] arr2 = new int[10]; // 나머지 값을 담을 배열

		for (int i = 0; i < 10; i++) {

			arr[i] = sc.nextInt();

		} // 배열 요소 입력

		for (int i = 0; i < 10; i++) {
			arr2[i] = arr[i] % 42; // 42로 나눈 나머지 값을 배열에 담아주기
		}

		Arrays.sort(arr2); // 배열 정렬해주고
		int cnt = 1; //처음 시작하는 수를 카운트 하고 시작

		for (int i = 1; i < 10; i++) { 
			if (arr2[i - 1] != arr2[i]) { //내 옆에 있는 애가 나랑 다르면
				cnt++; //카운트
			} else
				continue; //아니면 넘어가기
		}

		System.out.println(cnt);

	}

}
