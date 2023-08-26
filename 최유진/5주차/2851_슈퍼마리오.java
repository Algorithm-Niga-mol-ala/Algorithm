package algo;

import java.util.Scanner;

public class bj2851 {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			int prevSum = sum; //이전에 나온 sum값을 저장
			sum += sc.nextInt();
			if(sum > 100) { //100이 넘는 sum이 나오면 중단하고 이전에 나온 sum값과 비교
				sum = (sum-100 > 100-prevSum) ? prevSum : sum; //100과 차이가 적은 걸 sum에 다가 넣어준다.
				break; //sum엔 이미 큰 값이 들어있으니까 같을 경우에 더 큰 값을 넣어주는 경우 고려할 필요x
			}
		}
	
		System.out.println(sum);

	}

}
