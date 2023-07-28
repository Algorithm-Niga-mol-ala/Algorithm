import java.util.Scanner;

public class baekjoon2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String abcStr = Integer.toString(a * b * c);
		
		int[] resultArr = new int[10];
		
		for(int i = 0; i < abcStr.length(); i++) {
			//charAt 메서드의 경우 char형이기 때문에 int형으로 바꾸고자 하면 아스키코드 값으로 변환이 된다.
			//아스키코드의 경우 0은 48이기 때문에 0만큼을 빼주고 계산.
			int currentNum = (int) (abcStr.charAt(i) - '0');
			resultArr[currentNum]++;
		}
		
		for(int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}
}
