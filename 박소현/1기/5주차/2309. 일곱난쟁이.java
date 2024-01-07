import java.util.Arrays;
import java.util.Scanner;

public class Main2309_일곱난쟁이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    // 아홉명의 난쟁이 배열
		int[] dwarf = new int[9];

    // 난쟁이 키 합
		int sum = 0;
    
		for (int i = 0; i < 9; i++) {
			dwarf[i] = sc.nextInt();
			sum += dwarf[i]; // 배열에 난쟁이 키 넣어주기
		}
    
		Arrays.sort(dwarf);

		int[] minus = new int[2];

    // 빠질 두 명의 난쟁이 인덱스
		int one = 0;
		int two = 0;
    
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - dwarf[i] - dwarf[j] == 100) { // 합이 100이라면
					one = i; // 빠지는 난쟁이 인덱스 i
					two = j; // 빠지는 난쟁이 인덱스 j
				}
			}
		} // for

    // 출력
		for(int i=0; i<one; i++) {
			System.out.println(dwarf[i]);
		}
		for(int i =one+1; i<two; i++) {
			System.out.println(dwarf[i]);
		}
		for(int i=two+1; i<9; i++) {
			System.out.println(dwarf[i]);
		}

	}
}
