import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			String[] quiz = sc.next().split("");

			int cnt = 0;
			int ans = 0;

			int i = 0;
			for (i = 0; i < quiz.length; i++) {
				if (quiz[i].equals("O")) {
					cnt = 1;
					ans += cnt;

					int j = 1;
					while (i + j < quiz.length && quiz[i + j].equals("O")) {
						cnt++;
						ans += cnt;
						j++;
					}
					i = i + j - 1;
					cnt = 0;
				} else
					continue;
			}

			System.out.println(ans);

		} // tc

	}// main

}
