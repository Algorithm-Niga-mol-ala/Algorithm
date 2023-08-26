import java.util.Scanner;

public class No_2292_벌집 {

	public static void main(String[] args) {
		// 1 - 1
		// 2 - 7 ( 1+6 )
		// 3 - 19 ( 1+6+12 )...
		// 2의 경우, 6*(N-(N-1)) + 1
		// 4 - 37 .. 1 6 12 18
		// 3의 경우, 2번 나온다.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int cnt = 1;
		int cal = N-1;
		
		while ( cal > 0 ) {
			cal -= 6*cnt;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
