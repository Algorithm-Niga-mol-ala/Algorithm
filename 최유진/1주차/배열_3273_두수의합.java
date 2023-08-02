import java.util.Arrays;
import java.util.Scanner;

public class bj3273 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 정렬을 안 해주고 제출했을 때 시간 초과가 떴다.
    // 배열 안에 있는 int가 1000000보다 같은 자연수일 수 있기 때문에 정렬을 해주면 덧셈 횟수를 줄일 수 있다. 
    // (정렬을 해주었기 때문에 합이 x가 나오면 그 뒤의 덧셈은 계속 해줄 필요가 없음)
		Arrays.sort(arr);
		
		int x = sc.nextInt();
		int answer = 0;
		
		for(int i = 0; i < num-1; i++) {
			innerCase:
			for(int j = i+1; j < num; j++) {
				if(arr[i] + arr[j] == x) {
					answer++;
					// 오름차순 정렬을 했으므로, 합이 x가 되는 케이스가 나오면 내부 for문 중지.
					break innerCase;
				}
			}
		}	
		System.out.println(answer);
		
	}

}

//추가 설명
    //arr[0] + arr[1], arr[0] + arr[2], arr[0] + arr[3], arr[0] + arr[4] ...
    //                 arr[1] + arr[2], arr[1] + arr[3], arr[1] + arr[4] ...
    //                                  arr[2] + arr[3], arr[2] + arr[4] ...
    //위와 같은 합으로 가되, 합이 x가 되면 중지.
