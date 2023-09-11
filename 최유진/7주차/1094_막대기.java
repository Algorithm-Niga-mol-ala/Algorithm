package algo;

import java.util.Scanner;

public class bj1094 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int L = 64;
		int X = sc.nextInt();
		int sum = L; //버리고 남아 있는 막대 길이의 합
		int keep = 0; //모아두기
		int cnt = 0;

		while (sum != X) { 
			
			if (sum > X) {
				if (keep + L / 2 >= X) {
					sum -= L / 2; // 막대 하나를 버린다.
				} else {
					cnt++;
					keep += L / 2; // 아니면 킵한다.
				}
				L = L / 2; //다음 차례에 자를 길이 업데이트
			}

		}

		System.out.println(cnt + 1); //sum이 X가 됐다는 것은 다음 차례 한 번 더하면 X가 된다는 것이므로 cnt+1

	}

}
