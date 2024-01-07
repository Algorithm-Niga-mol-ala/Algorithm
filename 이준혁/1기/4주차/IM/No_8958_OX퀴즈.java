import java.util.Scanner;

public class No_8958_OX퀴즈 {

	public static void main(String[] args) {
		// 문제를 연속으로 맞추면 1씩 더 점수가 가산되어 오르는 퀴즈게임
		// ex) OOXOOOXXOXO인 경우 1점+2점 , 1점+2점+3점, 1점, 1점으로 11점이다.
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc=1; tc<=T; tc++) {
			
			int cnt = 0; // 가산점을 만들 카운트 0으로 선언과 동시에 초기화
			int res = 0; // 총 점수를 담아줄 res 역시 0으로 선언과 동시에 초기화
			
			String ox = sc.next(); // 입력받을 OX
			
			for (int i=0; i<ox.length(); i++) { // ox 길이만큼
				if ( ox.charAt(i) == 'O' ) { // chatAt으로 해당 열을 잘라서
					cnt++; // O인 경우 1씩 가산해주고
					res += cnt; // 카운트(점수)를 res에 넣어준다.
				} else {
					cnt = 0; // x를 만난 경우이므로 카운트 초기화
				}
			}
			System.out.println(res); // 결과 출력
		}
	}
}
