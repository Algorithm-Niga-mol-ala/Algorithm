package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bj10815 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//숫자카드는 cardArr
		int N = Integer.parseInt(br.readLine());
		String[] cardStrArr = br.readLine().split(" ");
		int[] cardArr = new int[N];
		for(int i = 0; i < N; i++) {
			cardArr[i] = Integer.parseInt(cardStrArr[i]);
		}

    		//이진 검색을 위해 cardArr 정렬
		Arrays.sort(cardArr);
		
		//상근이의 숫자 numsArr
		int M = Integer.parseInt(br.readLine());
		String[] numsStrArr = br.readLine().split(" ");
		int[] numsArr = new int[M];
		for(int i = 0; i < M; i++) {
			numsArr[i] = Integer.parseInt(numsStrArr[i]);
		}	

    		//상근이의 숫자를 for문 돌려주면서 이진 검색 실행
		for(int i = 0; i < M; i++) {
			int answer = binarySearch(cardArr, numsArr[i], 0, N-1);
			bw.write(Integer.toString(answer) + " ");
		}
		
		bw.close();

	}
	
	public static int binarySearch(int[] arr, int value, int low, int high) {
    		//low가 high를 넘어가버렸다면, 못찾은것이니까 0 리턴
		if(high < low) return 0;
    
		int mid = (low + high) / 2;
    
    		// 찾아야 할 value가 중간값보다 작다면 low ~ mid -1 까지 이진 탐색 다시 돌리세요
		if(arr[mid] > value) {
			return binarySearch(arr, value, low, mid-1);
    		// 찾아야 할 value가 중간값보다 크다면 mid+1 ~ high 까지 이진 탐색 다시 돌리세요
		} else if(arr[mid] < value) {
			return binarySearch(arr, value, mid+1, high);
    		// 찾아야 할 value = 중간값 이라면? 찾았으니끼 1 리턴
		} else {
			return 1;
		}
	}

}
