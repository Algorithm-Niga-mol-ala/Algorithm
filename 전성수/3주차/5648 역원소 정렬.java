import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		// 들어올 원소의 개수
		long[] nums = new long[N];
		// N개의 숫자를 받아줄 배열 선언
  // 들어올 수 있는 숫자의 범위사 10^12라서 int 범위(21억)를 넘음
    // 그래서 int 로  하면 런타임 에러가 나오고 그래서 다 Long 타입으로 바꿔줬음
		for (int i = 0; i < N; i++) {
			// N번 반복
			nums[i] = sc.nextLong();
		} // nums에 값을 받음
		String[] strs = new String[N];
		for (int i = 0; i < N; i++) {
			strs[i] = String.valueOf(nums[i]);
		} // long로 받은 값들을 String으로 변환 후 뒤집어줌

		for (int i = 0; i < N; i++) {
			StringBuilder sbsb = new StringBuilder(strs[i]);
			strs[i] = sbsb.reverse().toString();
  //StringBuilder의 reverse() 매서드를 사용해서 뒤집음 문자열을 반복문을 써서 charAt으로 뒤집기도 가능
		} // strs[i] 은 이제 뒤집어져있음
    
		for (int i = 0; i < N; i++) {
			// N번 반복
			nums[i] = Long.parseLong(strs[i]);
		}

		for (int i = 0; i < N - 1; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (nums[j] < nums[min])
					min = j;
			}
			long tmp = nums[min];
			nums[min] = nums[i];
			nums[i] = tmp;
		} // 선택정렬

		for (int i = 0; i < N; i++) {
			sb.append(nums[i] + "\n");
		}
		System.out.println(sb);

	}// main

}
