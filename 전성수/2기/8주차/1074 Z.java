import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N,r,c;
		
		String [] Nrc = br.readLine().split(" ",0);
		N = Integer.parseInt(Nrc[0]);
		r = Integer.parseInt(Nrc[1]);
		c = Integer.parseInt(Nrc[2]);
		
		System.out.println(Z(N,r,c));
		
	}
	static int Z(int N, int r, int c) {
		if(N==0) return 0;
		int param = (int)Math.pow(2, N-1);
		if(r<param && c<param)return Z(N-1,r,c);
		else if(r<param && c>=param)return param*param + Z(N-1,r,c-param);
		else if(r>=param && c<param)return 2*param*param+ Z(N-1,r-param,c);
		else return 3*param*param+Z(N-1,r-param,c-param);
		
	}
	

}
