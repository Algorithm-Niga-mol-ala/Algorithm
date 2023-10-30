package algo;

import java.util.Scanner;

public class bj_2609 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int s = B;
		int b = A;
		if(A < B) {
			s = A; //작은 수
			b = B; //큰 수
		}
		
		int yak = 1;
		for(int i = s; i >= 1; i--) { //A와 B중 작은 수부터 하나씩 줄여나가면서 나머지가 0인지 확인한다.
			if(s % i == 0 && b % i == 0) {
				yak = i;
				break;
			}
		}
		
		int bae = 0;
		bae = s / yak * b / yak * yak;
		
		System.out.println(yak);
		System.out.println(bae);

	}

}
