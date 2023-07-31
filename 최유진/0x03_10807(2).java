import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int v = sc.nextInt();
		int answer = 0;

              //정렬 후 배열을 돌고 있으므로 원하는 값을 찾으면 더 이상 탐색하지 않도록 멈춤.
		for(int n : arr) {
			if (n > v)
				break;
			if (n == v)
				answer++;
		}
		
		System.out.println(answer);

	}

}

// 기존 0x03_10807의 경우 정렬하지 않은 채 배열을 하나씩 돌며 확인. 메모리 17840KB 시간 220ms
// 해당 코드의 경우 정렬 후 돌면서 원하는 숫자(v)가 나오면 멈춤. 메모리 17904KB 시간 216ms

// 정렬을 했을 때(해당 코드) 메모리가 더 크지만 시간이 적게 나옴을 알 수 있었다.
