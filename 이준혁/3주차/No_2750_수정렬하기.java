import java.util.Scanner;

public class No_2750_수정렬하기 {

	public static void main(String[] args) {
		// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬
		// 버블 정렬, 선택 정렬, 삽입 정렬로 해결 가능 ( O(N^2) )
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] nums = new int[N];
		
		for (int i=0; i<N; i++) {
			nums[i] = sc.nextInt();
		}
		
		// 1. 버블 정렬로 해결하기
//		for (int i=0;i<nums.length; i++) {
//			for (int j=0; j<nums.length-1; j++) {
//				if ( nums[j] > nums[j+1] ) {
//					int tmp = nums[j];
//					nums[j] = nums[j+1];
//					nums[j+1] = tmp;
//				}
//			}
//		}
//		
//		for (int i=0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
		// 2. 선택 정렬로 해결하기 
		for (int i=0; i<nums.length; i++) {
			int min = i;
			
			for (int j=i+1; j<nums.length; j++) {
				if (nums[j] < nums[min]) {
					min = j;
				}
			}
			int tmp = nums[min];
			nums[min] = nums[i];
			nums[i] = tmp;
		}
		
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}
