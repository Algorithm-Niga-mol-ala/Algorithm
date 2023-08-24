
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 굳이 내가 빼줄 필요 없이 boolean으로 체크만 해주면 됨

		Scanner sc = new Scanner(System.in);

		boolean[][] map = new boolean[101][101];// 도화지의크기

		int N = sc.nextInt();// 색종이의 수

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int a = x; a < 10 + x; a++) {
				for (int b = y; b < 10 + y; b++) {
					map[b][a] = true;
				}
			}//도화지 넓이가 100이니까 10더해서 넓이 true로 바꿔주기
		}
		int cnt = 0;

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j]) { 
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}

}
