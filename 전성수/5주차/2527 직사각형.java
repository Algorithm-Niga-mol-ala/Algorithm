
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		for(int tc =0;tc<4; tc++ ) {
			//4줄의 입력을 받음
			
			String [] str= br.readLine().split(" ");
			int [] XYs = new int [8];
			//xy 좌표 4개를 받음
			for(int i=0; i<8; i++) {
				XYs[i]=Integer.parseInt(str[i]);
			}
			int x1 = XYs[0];
			int y1 = XYs[1];
			int p1 = XYs[2];
			int q1 = XYs[3];
			int x2 = XYs[4];
			int y2 = XYs[5];
			int p2 = XYs[6];
			int q2 = XYs[7];
			//좌표들
			//1번 사각형을 기준이라고 생각하고 2번 사각형의 경우에 대해 조건을 만듦
			if(x1>p2 || y1>q2 || p1 < x2 || q1< y2) {
				//이 경우에는 사각형들이 만나지 못함
				sb.append("d"+"\n");
			}else if((x1==p2 && q1==y2)||(x1==p2 && y1==q2)||(p1==x2 && y1==q2)||(p1==x2 && q1==y2)) {
				//1번 사각형을 기준으로 두고 2번 사각형이 각 꼭지점에서 만날 경우
				//사각형들의  꼭지점 좌표를 생각하면 됨
				sb.append("c"+"\n");
			}else if(x1==p2 || p1==x2 || y1 == q2 || q1==y2) {
				sb.append("b"+"\n");
			}else {
				sb.append("a"+"\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
