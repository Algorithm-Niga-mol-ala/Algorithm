import java.util.Scanner;

public class No_8320_직사각형을만드는방법 {

	public static void main(String[] args) {
		// 상근이는 변의 길이가 1인 정사각형 n개를 가진다. 직사각형을 몇 개 만들 수 있을까?
		// 직사각형은 n x m의 크기를 지닌다.
		
		// 개수를 늘려가며 고민을 해보면 결국 
		// n + n/2-1 + n/3-2 + ... + n/x-(x-1) 라는 공식에 도달한다.
		// 이는 2 <= x^2 <= n 일 때에만 적용될 수 있으므로 ( 더 작은 경우에는 - 값이 생긴다 )
		// 제곱근을 구해 조건에 따라 반복을 해주면 값을 구할 수 있을 것이다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 입력값 n
		
		int rt = (int)Math.sqrt(n); // Math.sqrt는 제곱근. int로 바꿔 절삭
		
		int res = 0; // 초기값 설정 n을 담아준다.
		
		for (int i=0; i<rt; i++) { // n/1-(1-1)이라면 n이기에 중복 호출이 불가넝
			res += n/(rt-i)-(rt-i-1); // 만들어낸 공식을 res에 더해준다.
		}
		System.out.print(res); // 출력
	}
}
