import java.math.BigInteger;
import java.util.Scanner;

public class No_10757_큰수AplusB {

	public static void main(String[] args) {
		
		// 1. BigInteger를 이용한 풀이
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = sc.nextBigInteger(); // BigInteger 선언 후 입력 받기
		BigInteger B = sc.nextBigInteger();
		
		System.out.println(A.add(B)); // A에 B를 더하는 행동을 A.add(B)와 같이 쓴다.
	}
}
