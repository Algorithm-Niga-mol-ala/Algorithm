import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		// 5 입력
		ArrayList<XY> XYs = new ArrayList<>();
		// 5줄의 입력 받기
		for (int t = 1; t <= N; t++) {
			String[] str = br.readLine().split(" ");
			XYs.add(new XY(Integer.parseInt(str[0]),Integer.parseInt(str[1])));
      
		}
		
		Collections.sort(XYs);
		
		for(int i =0; i<N; i++) {
			bw.write(XYs.get(i).x+" "+XYs.get(i).y+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}// main

}

class XY implements Comparable<XY>{ //sort를 쓰려면 Comparable<> 이나 Comparator 인터페이스를 구현해야
	int x;
	int y;

	public XY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	@Override
	public int compareTo(XY o) { // return 값이 음수이면 자리를 안바꾸고 리턴값이 양수이면 자리를 바꿈 << 그렇게 정해져있는 매서드
		if(this.y==o.y) {
			return this.x>o.x? 1:-1;
		}
		return this.y>o.y? 1:-1; // 자신보다 들어온 값이 작으면 자리를 바꿈 ex) 2 1 -> 1 2 <<오름차순 
		//return this.y >o.y ? -1:1 >> 내가 들어온 애보다 크면 바꾸지 않음 ex) 2 1 -> 2 1 <<내림차순
	}

	
}
