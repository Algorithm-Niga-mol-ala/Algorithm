import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		int answer = 0;
		
		for(int n : arr) {
			if (n == v)
				answer++;
		}
		
		System.out.println(answer);

	}

}
