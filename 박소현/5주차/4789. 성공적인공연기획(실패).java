import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

import java.util.Scanner;

public class Solution_성공적인공연기획 {
  // 테스트케이스 10개 중 8개만 패스 ㅠ.ㅠ

	public static void main(String[] args) throws IOException {
		// i번째 숫자는 i-1명이 박수쳐야 박수를 침
		// 주어진 숫자가 110011일 경우
		// 첫번째 1은 0명이 박수칠 때 박수 침
		// 두번째 1은 1명이 박수칠 때 박수 침 -> 따라서 박수쳐
		// 그 다음 박수치는 1은 4-1=3명이 박수쳐야 박수 침 -> 사람 1명 고용
		// 다음 박수치는 1은 6-1=5명이 박수쳐야 박수 침 -> 사람 1명 고용
		// 총 2명 고용 => 0의 개수를 세면 됨

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String str = br.readLine();

			int cnt = 0; // 0의 개수를 세기 위한 변수
			for (int i = 0; i < str.length(); i++) { // 입력받기
				char person = str.charAt(i);
//				System.out.println(person);
				
				if (person == '0')
					cnt++;
			}

			System.out.println("#" + tc + " " + cnt);

		} // tc for

	} // main

}
