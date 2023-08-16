import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		int answer = 0;
		for(int j = N-1; j >= 0; j--) {
      //max값이 업데이트되면 그 후부터 max보다 작으면 보이지 않음
			if(arr[j] > max) {
				answer++;
				max = arr[j];
			} 
		}
		
		System.out.println(answer);

	}

}
