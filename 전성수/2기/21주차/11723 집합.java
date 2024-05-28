import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(br.readLine());
		HashSet<Integer> set = new HashSet();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=20; i++) {
			list.add(i);
		}
		for(int i=0; i<M; i++) {
			String [] cmd = br.readLine().split(" ");
			
			switch(cmd[0]) {
			case "add":
				set.add(Integer.parseInt(cmd[1]));
				break;
			case "check":
				if(set.contains(Integer.parseInt(cmd[1]))) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
				break;
			case "remove":
				set.remove(Integer.parseInt(cmd[1]));
				break;
			case "toggle":
				if(set.contains(Integer.parseInt(cmd[1]))) {
					set.remove(Integer.parseInt(cmd[1]));
				}else {
					set.add(Integer.parseInt(cmd[1]));
				}
				break;
			case "all":
					set.addAll(list);
				break;
			case "empty":
				set.clear();
				break;
			}
		}
		System.out.println(sb.toString());
		
		
	}

}
