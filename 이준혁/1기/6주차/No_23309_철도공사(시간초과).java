import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No_23309_철도공사 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		
//		int N = sc.nextInt();
//		int M = sc.nextInt();
		String[] tmp = br.readLine().split(" ");
		int N = Integer.parseInt(tmp[0]);
		int M = Integer.parseInt(tmp[1]);
		
		String[] tmp2 = br.readLine().split(" ");
				
		for (int a=0; a<N; a++) {
//			li.add(sc.nextInt());
			li.add(Integer.parseInt(tmp2[a]));
		}

		int i;
		int j;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int a=0; a<M; a++) {
//			String info = sc.next();
			String info = br.readLine();
			StringTokenizer st = new StringTokenizer(info);
			
			String gs = st.nextToken();
			
			if (gs.equals("BN")) {
				i = Integer.parseInt(st.nextToken());
				j = Integer.parseInt(st.nextToken());
				
				if ( li.indexOf(i)+1 < li.size() ) {
					bw.write(li.get(li.indexOf(i)+1)+"\n");
					li.add(li.indexOf(i)+1, j);
				} else {
					bw.write(li.get(li.size()-li.indexOf(i)-1)+"\n");
					li.add(li.indexOf(i)+1, j);
				}
			} else if (gs.equals("BP")) {
				i = Integer.parseInt(st.nextToken());
				j = Integer.parseInt(st.nextToken());

				if ( li.indexOf(i)-1 >= 0 ) {
					bw.write(li.get(li.indexOf(i)-1)+"\n");
					li.add(li.indexOf(i), j);
				} else {
					bw.write(li.get(li.size()-1)+"\n");
					li.addLast(j);
				}
				
			} else if (gs.equals("CN")) {
				i = Integer.parseInt(st.nextToken());
							
				if ( li.indexOf(i)+1 < li.size() ) {
					bw.write(li.remove(li.indexOf(i)+1)+"\n");
				} else {
					bw.write(li.remove()+"\n");
				}
				
			} else if (gs.equals("CP")) {
				i = Integer.parseInt(st.nextToken());
	
				if ( li.indexOf(i)-1 >= 0 ) {
					bw.write(li.remove(li.indexOf(i)-1)+"\n");
				} else {
					bw.write(li.removeLast()+"\n");
				}	
			}
			
//			if (info.equals("BN")) {
//				i = sc.nextInt();
//				j = sc.nextInt();
//				
//				if ( li.indexOf(i)+1 < li.size() ) {
//					System.out.println(li.get(li.indexOf(i)+1));
//					li.add(li.indexOf(i)+1, j);
//				} else {
//					System.out.println(li.get(li.size()-li.indexOf(i)-1));
//					li.add(li.indexOf(i)+1, j);
//				}
//				
//			} else if (info.equals("BP")) {
//				i = sc.nextInt();
//				j = sc.nextInt();
//
//				if ( li.indexOf(i)-1 >= 0 ) {
//					System.out.println(li.get(li.indexOf(i)-1));
//					li.add(li.indexOf(i), j);
//				} else {
//					System.out.println(li.get(li.size()-1));
//					li.addLast(j);
//				}
//				
//			} else if (info.equals("CN")) {
//				i = sc.nextInt();
//				
//				if ( li.indexOf(i)+1 < li.size() ) {
//					System.out.println(li.remove(li.indexOf(i)+1));
//				} else {
//					System.out.println(li.remove());
//				}
//				
//			} else if (info.equals("CP")) {
//				i = sc.nextInt();
//	
//				if ( li.indexOf(i)-1 >= 0 ) {
//					System.out.println(li.remove(li.indexOf(i)-1));
//				} else {
//					System.out.println(li.removeLast());
//				}	
//			}
		}
		
		bw.flush(); // 남은 데이터 모두 출력
		bw.close(); // 스트림 닫음
	}
}
