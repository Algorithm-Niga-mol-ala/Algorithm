package java23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String [] str = br.readLine().split("");
		int[] nums = new int[str.length];
		for(int i=0; i<str.length;i++) {
			nums[i]=Integer.parseInt(str[i]);
		}//int로 바꿔줌
    
		int N = nums.length;
    
		for(int i=0; i<N-1;i++) {
			int max = i;
			for(int j =i+1;j<N;j++) {
				if(nums[j]>nums[max]) max=j;
			}//반복이 끝나면 가장 큰 값의 인덱스가 min에 담겨있음
			int tmp = nums[i];
			nums[i] = nums[max];
			nums[max] = tmp;
		}
		for(int i=0; i<N; i++) {
		bw.write(String.valueOf(nums[i]));
    //코드의 가독성을 위해서 ""을 더해주는 것보다 String.valueOf를 쓰는 것이 좋다고 한다
		}
		
		bw.flush();
		bw.close();
		br.close();
	}// main

}
