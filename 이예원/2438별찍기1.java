
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

		// 정수 N을 입력받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// i가 1부터 시작해서 N의 길이가 될 때까지
		for (int i = 1; i <= N; i++) {
			// j가 1부터 i와 값이 같아질 때까지 *을 출력하는 반복
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// 줄바꿈
			System.out.println();
		}

	}

}
