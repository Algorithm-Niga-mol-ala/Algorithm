import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에
		// 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성

		// 첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다.
		// A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.

		// 첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다.
		// 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에
		// 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.

		// 값을 입력받아용
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// 입력 받은 값 3개를 모두 곱해
		int result = a * b * c;

		// abc를 곱한 값을 score 배열에 하나하나 집어넣을 때마다 카운트
		// 어떻게 하나하나 집어넣을 수 있을까? 값 하나하나?

		// 값을 문자열로 바꿔볼까?
		String count = Integer.toString(result);

		// 이 문자열을 하나하나 뽑아서 배열에 카운트해야함
		// split함수로 하나하나 배열에 저장하기

		// 스트링을 담을 배열
		String[] word;

		// 배열에 한글자씩 저장하기
		word = count.split("");

		// 111 123 456 = 6225768 -> 0 0 2 0 0 1 2 1 1 0

		// 10길이를 가진 배열 score 생성
		int[] score = new int[10];

		// 값에 따라 배열에 들어가게 작성
		// word의 값이랑 score의 인덱스가 같은지 어떻게 비교하지?
		// String 을 int로 바꿔서 비교해야함

		// i가 word의 길이를 다 돌 때까지
		for (int i = 0; i < word.length; i++) {
			// String 배열 temp에 word배열의 값 하나하나 넣어줌
			String temp = word[i];
			// String temp를 int로 바꿔준다
			int temp2 = Integer.parseInt(temp);
			// 인덱스는 수가 하나씩 작으니까 1씩 더해서 넣어줌
			score[temp2] = ++score[temp2];
		}

		// 몇번씩 들어갔는지 나오는 for문
		for (int h = 0; h < score.length; h++) {
			System.out.println(score[h] + " ");
		}

	}

}
