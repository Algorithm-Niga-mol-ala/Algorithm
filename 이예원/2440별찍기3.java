
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

		// 정수 입력 받는 스캐너 생성
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		// 별을 찍는 for문 작성....
		// 근데 반대로 찍으려면 어떻게 해야할까?
		// 순서대로 찍는건 i=1;i<=N 로 설정해놨었음
		// 내림차순으로 조건을 설정?

		for (int i = N; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
