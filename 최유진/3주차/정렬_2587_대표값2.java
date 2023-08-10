package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj2587 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 평균 구하기
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		System.out.println(sum/5);
		
		// 정렬 후 중간값 구하기
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 5; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		System.out.println(arr[5/2]);
		
		bw.close();

	}

}
