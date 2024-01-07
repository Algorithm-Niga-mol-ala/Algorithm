
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {

		/*
		 * N개의 수가 주어졌을 때, 오름차순으로 정렬하는 프로그램
		 * 
		 * 첫째 줄에는 수의 개수 N 입력 둘째줄부터 수가 N개 주어진다
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); // N의 값 입력받기
		//대체 왜 int타입으로 입력받으면 이상하게 받을까? 검색해보기

		String[] nums = new String[N];
		int[] nums2 = new int[N];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = br.readLine(); // nums배열에 수 N개 저장
			nums2[i] = Integer.parseInt(nums[i]);
			
		}

		// 선택정렬을 사용해서 오름차순 정렬을 해보자~
		for (int i = 0; i < nums2.length - 1; i++) {
			int minIdx = i; // 최솟값의 인덱스!! 넘버 저장
			for (int j = i + 1; j < nums2.length; j++) {
				if (nums2[j] < nums2[minIdx]) {
					minIdx = j;
				} // 전체를 돌아서 최솟값의 인덱스가 결정된다면
			}
			int tmp = nums2[i];
			nums2[i] = nums2[minIdx];
			nums2[minIdx] = tmp; // 값을 바꿔줍니다
		}

		// 배열의 요소를 하나씩 출력하기
		for (int i = 0; i < nums2.length; i++) {
			bw.write(nums2[i]+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}// main
	

}// class
