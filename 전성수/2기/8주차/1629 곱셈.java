import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	static int A,B,C; 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		
		String [] ABC = br.readLine().split(" ",0);
		A = Integer.parseInt(ABC[0]);
		B = Integer.parseInt(ABC[1]);
		C = Integer.parseInt(ABC[2]);
		
		System.out.println(multi(A,B,C));
		
	}
	
	static long multi(int a, int b, int c) {
		if(b==1) {
			return a%c;
		}//기저
    
		long ans = multi(a,b/2,c);
    
		ans = ans*ans % c;
    
		if(b%2==0) return ans;
		return ans*a%c;
		
	}

}
