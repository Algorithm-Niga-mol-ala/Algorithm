
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//값 입력받고 오름차순으로 정렬하기
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //
		
		int[] arr = new int[N]; // N길이의 배열 생성
		
		for(int i = 0; i < N; i++) { //배열의 요소 값 입력받기
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < N-1; i++) {
			int minIdx = i; // minIdx의 "인덱스"를 저장
			for(int j = i+1; j < N; j++) {
				if(arr[j] < arr[minIdx]) {
					minIdx = j;
				}
				
			}// 정렬하는 for문이 끝나면! 
			
			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;
			
		}//전체를 반복하는 for문
		
		for(int k = 0; k < N; k++) {
			System.out.println(arr[k]);
		}
		

	}//main

}//class
