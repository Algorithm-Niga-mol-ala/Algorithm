import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int cnt = 0;

		for (int i = 1; i <= n; i++) {
            //i가 0부터 시작하면 곱했을 때 0돼서 안됨
			for (int j = 1; j <= i; j++) {
            //방향 바꿨을 때 겹치니까 i까지 곱하기
				if (i * j <= n) {
					cnt++;
				}

			}
		}
		System.out.println(cnt);

	}

}
