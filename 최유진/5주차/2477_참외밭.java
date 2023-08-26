package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj2477 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 가장 긴 세로의 양 옆 길이의 차 = 작은 직사각형의 가로.
		// 가장 긴 가로의 양 옆 길이의 차 = 작은 직사각형의 세로.

		int melonNum = Integer.parseInt(br.readLine());
		String[][] map = new String[6][2];

		// 가로 1, 2
		// 세로 3, 4
		int maxWidth = 0;
		int maxWidthIdx = -1;
		int maxHeight = 0;
		int maxHeightIdx = -1;

		for (int i = 0; i < 6; i++) {
			String[] line = br.readLine().split(" ");
			map[i] = line;
		}

		for (int i = 0; i < 6; i++) {
			if (map[i][0].equals("1") || map[i][0].equals("2")) {
				if (maxWidth < Integer.parseInt(map[i][1])) {
					maxWidth = Integer.parseInt(map[i][1]);
					maxWidthIdx = i;
				}
			} else if (map[i][0].equals("3") || map[i][0].equals("4")) {
				if (maxHeight < Integer.parseInt(map[i][1])) {
					maxHeight = Integer.parseInt(map[i][1]);
					maxHeightIdx = i;
				}
			}
		}

    //가장 긴 가로의 양 옆 인덱스 제한
		int leftHeight = maxHeightIdx-1 >= 0 ? Integer.parseInt(map[maxHeightIdx - 1][1]) : Integer.parseInt(map[5][1]);
		int rightHeight = maxHeightIdx+1 < 6 ? Integer.parseInt(map[maxHeightIdx + 1][1]) : Integer.parseInt(map[0][1]);
    //가장 긴 세로의 양 옆 인덱스 제한
		int leftWidth = maxWidthIdx-1 >= 0 ? Integer.parseInt(map[maxWidthIdx - 1][1]) : Integer.parseInt(map[5][1]);
		int rightWidth = maxWidthIdx+1 < 6 ? Integer.parseInt(map[maxWidthIdx + 1][1]) : Integer.parseInt(map[0][1]);
		
		// 작은 직사각형의 가로.
		int width = Math.abs(leftHeight-rightHeight);
		// 작은 직사각형의 세로.
		int height =  Math.abs(leftWidth-rightWidth);

		int sum = maxWidth * maxHeight - width * height;

		String answer = Integer.toString(sum * melonNum);
		bw.write(answer);
		bw.close();

	}

}
