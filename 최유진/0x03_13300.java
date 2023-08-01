package java0801;

import java.util.Scanner;

public class bj13300 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 int k = sc.nextInt();
		 
		 double[][] arr = new double[2][6];
		 
		 for(int i = 0; i < num; i++) {
				 int gender = sc.nextInt(); // 0또는 1
				 int grade = sc.nextInt(); // 1, 2, 3, 4, 5, 6
				 switch (gender) {
				 	case 0 :
				 			arr[0][grade-1]++;
				 			break;
				 	case 1 :
				 			arr[1][grade-1]++;
				 			break;
				 }
		 }

    //arr에 이러한 형태로 저장. -> [[1, 2, 1, 0, 1, 1], [2, 1, 3, 1, 2, 1]] i는 성별, j는 학년
		 
		 int answer = 0;
		 
		 for(int i = 0; i < 2; i++) {
			 for(int j = 0; j < 6; j++) {
				 answer += Math.ceil(arr[i][j] / k);
			 }
		 }
		 
		 System.out.println(answer);

	}

}
