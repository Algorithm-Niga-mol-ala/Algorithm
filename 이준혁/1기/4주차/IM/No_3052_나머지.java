import java.util.Scanner;

public class No_3052_나머지 {

	public static void main(String[] args) {
		// 두 자연수 A와 B가 있을 때 A%B는 나머지이다.
		// 수 10개를 입력받은 뒤 42로 나눠 나머지를 구한다.
		// 그리고 서로 다른 값이 몇 개인지 출력하라. ( 즉, 나머지의 종류 수 출력 )
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[42]; // 나머지가 0~41이므로 카운트해줄 1차원 배열 제작
		int res = 0; // 서로 다른 값 받을 변수
		
		for (int i=0; i<10; i++) { // 10개 입력
			arr[sc.nextInt() % 42]++; // 입력받은 값을 42로 나눈 나머지를 인덱스로 넣어 1씩 더해준다.
		}
		
		for (int i=0; i<arr.length; i++) { // 배열 모두 순회
			if ( arr[i] != 0 ) { // 0이 아니면 나머지가 한 개라도 나온 것이므로
				res++; // 결과값에 하나를 더해준다.
			}
		}
		System.out.println(res);
	}
}
