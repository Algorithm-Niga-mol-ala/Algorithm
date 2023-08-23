import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int cnt = 1; // 겹 수
		int range = 2; // 범위의 최솟값 (1 제외할거라서 최솟값 2)

		if (N == 1) { //1은 무조건 1이니까 제외하고 시작
			System.out.println(cnt);

		} else { //1이 아니라면

			while (range <= N) { //N이 될 때까지 겹수에다가 6 곱하고 범위에 더해주기
        //왜냐면 범위 6개씩 겹수가 늘어남

				range = range + (6 * cnt);
				cnt++;

			}

			System.out.println(cnt);
		}

	}

}
