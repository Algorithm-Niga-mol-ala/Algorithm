
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {

		/*
		 * 2차원 평면 위의 점 N개가 주어진다 좌표를 y좌표가 증가하는 순으로, 만약 y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력
		 * 
		 * 입력 : 첫째 줄에 점의 개수 N, 둘째 줄부터 N개의 줄에 i번 점의 위치가 각각 주어짐
		 * 
		 * 출력 : 첫째 줄부터 N개의 점을 정렬하여 출력
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine()); // 각 점의 갯수

		int[] point = new int[N * 2];

		int[] arrX = new int[N];
		int[] arrY = new int[N];

		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" "); // 한문장 입력받고 쪼개서 하나씩 넣어줌
			point[i * 2] = Integer.parseInt(str[0]);
			point[(i * 2) + 1] = Integer.parseInt(str[1]);

		} // 여기까지하면 point에 애들이 다 들어갔다

		for (int i = 0; i < point.length; i++) {
			if (i % 2 == 0) {
				arrX[i / 2] = point[i];
			} else if (i % 2 != 0) {
				arrY[i / 2] = point[i];
			}
		} // point의 인덱스가 홀수면 arrY, 짝수면 arrX에 저장

		// 여기까지 정렬했다~~!~!~! 출력은 우찌 할건가....
		// 묶고 Y의 값에 따라 같이 출력되게하기

		// arrX와 arrY를 묶어서 배열을 만들기

		String[] arrStr = new String[N];
		for (int i = 0; i < N; i++) {
			arrStr[i] = arrX[i] + " " + arrY[i];
		} // 배열을 묶어줌

		Arrays.sort(arrY);

		for (int i = 0; i < N; i++) {
			System.out.println(arrStr[i]);
		}
    
		//이러면 그대론디?
		
		//여기서부터 혹시 아이디어 있으신분,,ㅎ
    //뭔가 잘못됐다고 생각이 들었을 때 틀었어야하는디,,,
		

	}// main

}// class
