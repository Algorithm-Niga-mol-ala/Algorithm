
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 두 개의 문자열에 대해, 2번째 문자열이 1번째 문자열에 strfry 함수를 적용하여 얻어질 수 있는지 판단하라

		// 입력의 첫 번째 줄은 테스트 케이스의 수 0 < N < 1001 이다.

		// 입력
		// 각각의 테스트 케이스는 하나의 줄에 영어 소문자들로만 이루어진 두 개의 문자열이 한 개의 공백으로 구분되어 주어진다. 각각의 문자열의
		// 길이는 최대 1000 이다.

		// 출력
		// 각각의 테스트 케이스에 대해, 2번째 문자열이 1번째 문자열에 strfry 함수를 적용하여 얻어질 수 있는지의 여부를
		// "Impossible"(불가능) 또는 "Possible"(가능)으로 나타내시오.

    // 1. 문자를 입력받고 char로 형변환해서 한개씩 비교?
    // 2. 문자를 오름차순으로 정렬해서 비교?

		// 테스트케이스, 문자열 입력받기
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

//		String[] arr = new String[t];
//		
//		for(int i = 0; i < t; i++) {
//			for (int j = 0; j < 2; j++) { //이렇게하고 오름차순 정렬해서 출력하면
//				arr[i] = sc.next();       //공백 뒤에 입력된 값만 출력됨
//			}
//		}
//		
//		Arrays.sort(arr);

		for (int i = 0; i < t; i++) {
			int[] al = new int[26]; // 알파벳 개수 26 길이의 배열 생성
			boolean check = true; // boolean 타입의 check 변수를 만들고 기본값을 true로 설정
			char[] word1 = sc.next().toCharArray(); // char 배열을 2개 만듦
			char[] word2 = sc.next().toCharArray();
			// al[c-97]은 소문자a의 아스키코드의 값이 97이기 때문에 0~25까지 al배열에 순서대로 알파벳을 담을 수 있음
			for (char c : word1)
				al[c - 97]++;// for each 문을 이용해 word1의 배열을 char타입 배열 c에 담음
			for (char c : word2)
				al[c - 97]--;
			for (int j : al) // int자료형의 al배열의 크기만큼 반복해서 j배열에 담음
				if (j != 0)
					check = false; // 그리고 al의 크기만큼 반복해서 값이 0이 아니면 false를 반환
			System.out.println(check ? "Possible" : "Impossible");

		}

	}

}
