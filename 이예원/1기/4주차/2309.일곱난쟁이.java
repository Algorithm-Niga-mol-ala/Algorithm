
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] dwarf = new int[9];

		for (int i = 0; i < 9; i++) {
			dwarf[i] = sc.nextInt();
		} // 9번동안 키 입력받기

		// 난쟁이 9명의 키 총합 구하기
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			sum += dwarf[i];
		}

		// 원래 난쟁이 7명의 합 : 100
		int gap = sum - 100;

		Arrays.sort(dwarf); // 정렬
		int start = 0;
		int end = 8;

		while (start < end) {
			if (dwarf[start] + dwarf[end] < gap) {
				start++;
			} else if (dwarf[start] + dwarf[end] > gap) {
				end--;
			} else
				break;
		}

		for (int i = 0; i < 9; i++) {
			if (i == start || i == end) {
				continue;
			} else
				System.out.println(dwarf[i]);

		}

	}// main

}// class
