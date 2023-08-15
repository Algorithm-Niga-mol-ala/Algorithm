import java.util.Scanner;

public class No_2587_대표값2 {

	public static void main(String[] args) {
		// 어떤 수들을 크기 순서대로 놓았을 때 중앙에 있는 값이 중앙값이다.
		// 5개의 자연수가 주어질 때 평균과 중앙값을 구하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[5];
		int sum = 0;
		
		for (int i=0; i<5; i++) {
			n[i] = sc.nextInt();
			sum += n[i];
		}
		
		int avr = sum / 5;
		
		// 버블정렬로 시도 ( 다른 방식의 정렬을 사용해도 된다. )
		for (int i=0; i<5; i++) {
			for (int j=0; j<4; j++) {
				if ( n[j] > n[j+1] ) {
					int tmp = n[j];
					n[j] = n[j+1];
					n[j+1] = tmp;
				}
			}
		}
		
		System.out.println(avr);
		System.out.println(n[2]);
	}
}
