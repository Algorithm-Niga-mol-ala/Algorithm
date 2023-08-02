package java0801;

import java.util.Scanner;

public class bj11328 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			String str1 = sc.next(); //"abcd"
			String[] str2Arr = sc.next().split(""); //{"d", "c", "b", "a"}
			
			boolean isPossible = true;
			
			if(str1.length() == str2Arr.length) {
				for(int j = 0; j < str1.length(); j++) {
					for(String str2: str2Arr) {
						if(str1.contains(str2)) {
							str1 = str1.replaceFirst(str2, "");
						} else {
							isPossible = false;
							break;
						}
					}
				}
			} else {
				isPossible = false;
			}
			
			if (isPossible)
				sb.append("Possible").append("\n");
			else
				sb.append("Impossible").append("\n");
		}
		System.out.println(sb);
		
		
	}
}
