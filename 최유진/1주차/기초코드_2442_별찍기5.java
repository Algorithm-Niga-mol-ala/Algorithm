import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		for(int i = 0; i < num; i++) {
			
			for (int j = 0; j < num-1-i; j++) {
				System.out.print(" ");
			}

			for (int m = 0; m < i*2 +1; m++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
