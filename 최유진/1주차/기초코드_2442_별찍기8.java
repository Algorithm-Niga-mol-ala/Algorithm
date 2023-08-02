import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			
			for (int m = 0; m < (num*2-2)-(2*i); m++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		for (int i = num - 1; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			for (int m = 0; m < (num*2)-(2*i); m++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}

}
