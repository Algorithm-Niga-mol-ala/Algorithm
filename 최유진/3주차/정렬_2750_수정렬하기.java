import java.util.Scanner;

public class bj2750 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = i+1; j < num; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		
		for(int n : arr) {
			System.out.println(n);
		}

	}

}
