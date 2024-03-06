package java23;

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

		String [] NM = br.readLine().split(" ",0);
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		int [] students = new int[N+1];
		List<List<Integer>> list = new ArrayList<>();
		for(int i=0; i<=N; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i =0; i<M; i++) {
			String [] now = br.readLine().split(" ",0);
			list.get(Integer.parseInt(now[0])).add(Integer.parseInt(now[1]));
			students[Integer.parseInt(now[1])]++;
		}
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=N; i++) {
			if(students[i]==0) {
				q.add(i);
			}
		}
		
		while(!q.isEmpty()) {
			int now = q.poll();
			sb.append(now+" ");
			for(int i=0; i<list.get(now).size(); i++) {
				students[list.get(now).get(i)]--;
				if(students[list.get(now).get(i)]==0) {
					q.add(list.get(now).get(i));
				}
				}
			
		}
		System.out.println(sb.toString());
	}
}
