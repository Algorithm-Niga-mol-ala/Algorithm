import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String abcStr = Integer.toString(a * b * c);
		String[] abcStrArr = abcStr.split("");
		//예제 입력의 경우, abcStrArr = {1, 7, 0, 3, 7, 3, 0, 0}
		
		int[] resultArr = new int[10];
		//예제 입력의 경우, resultArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		
		for(int i = 0; i < abcStrArr.length; i++) {
			int currentNum = Integer.parseInt(abcStrArr[i]);
			resultArr[currentNum]++;
		}
		
		for(int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}
}
