import java.util.Scanner;

public class No_1592_영식이와친구들 {

	public static void main(String[] args) {
		// 영식이와 친구들이 원형으로 모여서 시계방향으로 1부터 N까지 자리에 앉는다.
		// 1번 공 받고 던지고, 받은 사람 던지고 반복한다.
		// 한 사람이 M번 받으면 종료 (지금 받은 공 포함)
		// 1 - 3 - 5 - 2 - 4 - 1(2) - 4 - 2 - 5 - 3 - 1(3)
		// 홀수번이면 시계방향 L번째에게, 짝수번이면 반시계 L번째에
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 자리 번호 최대값 ( 1~N 자리 )
		int M = sc.nextInt(); // 요정도 받으면 종료하겠다~
		int L = sc.nextInt(); // L번째 사람한테 던지겠다.
		
		int[] cnt = new int[N]; // 배열 안에 M과 비교할 카운트 배열을 만들어준다.
		
		int x = 0; // 시작점은 0번 인덱스에 해당하는 1번 친구
		int thr = -1; // while문 시작과 동시에 던지는 것을 취급하기에 초기값 -1
		
		while ( true ) {
			cnt[x]++; // cnt 배열로 공을 받은 횟수 체크
			thr++; // thr로 던진 횟수 체크
			
			if ( cnt[x] % 2 == 1 ) { // 받은 사람이 홀수번일 때
				if ( cnt[x] == M ) { // M번 받았다면
					System.out.println(thr); // 던진 횟수 출력
					return; // 반환하여 종료
				}
				x = (x+L) % N; // 시계방향 L번째, 마지막 사람일 경우 0번인덱스로 돌기 위해
		
			} else if ( cnt[x] % 2 == 0 ) { // 받은 사람이 짝수번일 때
				if ( cnt[x] == M ) { // M번 받았다면
					System.out.println(thr); // 던진 횟수 출력
					return; // 반환하여 종료
				}
				
				if ( (x-L) < 0 ) { // 반시계 L번째이므로 음수가 나올 경우
					x = N+(x-L); // 최대값 위치 기준에서 떨어진 곳으로
				} else {
					x = (x-L); // 양수일 경우는 그대로 던진다.
				}
			}
		}
	}
}
