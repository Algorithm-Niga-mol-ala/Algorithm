import java.util.Arrays;
import java.util.Scanner;

public class Main13300_방배정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 총 학생 수
		int K = sc.nextInt(); // 한 방의 최대 인원 수

		// 학년별 여학생 남학생 수. 혼란 방지로 크기를 7로 설정
		int[] female = new int[7]; // 여자
		int[] male = new int[7]; // 남자

		for (int i = 0; i < N; i++) {
			int gender = sc.nextInt(); // 성별
			int grade = sc.nextInt(); // 학년

			for (int j = 1; j < 7; j++) {
				if (gender == 1 && grade == j) // 여자
					female[j]++;
				if (gender == 0 && grade == j) // 남자
					male[j]++;
			}
		}

//		System.out.println(Arrays.toString(female));
//		System.out.println(Arrays.toString(male));

		// 방 수
		int room = 0;

		// 학생 수가 0보다 클 때 방 배정하기
		for (int i = 1; i < 7; i++) {
			if (female[i] > 0) {
				if (female[i] % K == 0) // 한 방당 최대 인원으로 나눠질 경우
					room += female[i] / K;
				else
					room += female[i] / K + 1; // 안 나눠지면
			}
			if (male[i] > 0) {
				if (male[i] % K == 0) // 한 방당 최대 인원으로 나눠질 경우
					room += male[i] / K;
				else
					room += male[i] / K + 1; // 안 나눠지면
			}
		}

		System.out.println(room);
	}

}
