import java.util.Scanner;

public class No_13458_시험감독 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int B = sc.nextInt(); // 총감독관 감시 수
		int C = sc.nextInt(); // 부감독관 감시 수
		
		long res = 0; // 결과를 담아줄 long 변수
		
		for (int i=0; i<N; i++) {
			arr[i] = arr[i]-B; // 항상 1명의 총감독관은 필요하므로 빼준다.
			res++; // 결과에 1명 추가
			
			if (arr[i] > 0) { // 아직 감독할 학생이 남았다면
				res += arr[i]/C; // 학생 수를 부감독관 감시 수와 나눈 값을 결과에 추가
				
				if (arr[i]%C != 0) { // 만약 나눈 나머지가 떨어지지 않는다면 (남은 학생이 있다면)
					res++; // 결과에 1명 추가
				}
			}
		}
		System.out.println(res);
	}
}
