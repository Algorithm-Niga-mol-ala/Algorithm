
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// n개의 서로 다른 양의 정수 a1, a2, ..., an으로 이루어진 수열이 있다.
		// ai의 값은 1보다 크거나 같고, 1000000보다 작거나 같은 자연수이다.
		// 자연수 x가 주어졌을 때, ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 (ai, aj)쌍의 수를 구하는 프로그램을
		// 작성하시오.

		// 첫째 줄에 수열의 크기 n이 주어진다. 다음 줄에는 수열에 포함되는 수가 주어진다. 셋째 줄에는 x가 주어진다.

		// 일단 배열 만들어서 오름차순 정리, 양쪽끝에서부터 좁혀오기

		// 값 먼저 입력받기

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int x = sc.nextInt();

		Arrays.sort(arr); // 배열을 오름차순으로 정렬

		int left = 0; // 맨 왼쪽 포인트
		int right = (n - 1); // 맨 오른쪽 포인트
		int cnt = 0; // 쌍의 수를 저장할 변수

		while(left < right) { 
			int sum = arr[left]+arr[right];
			if (sum == x) { //맨 첫째 값과 맨 끝 값이 X와 같으면  카운트++, 범위는 하나씩 좁힘
				cnt++;
				left++;
				right--;
			} else if (sum < x) { //더한 값이 x보다 작다면 조금 더 큰수가 필요하니까 작은값을 올리기
				left++;
			} else if (sum > x)
				right--;
		}

		System.out.println(cnt);

	}
}
