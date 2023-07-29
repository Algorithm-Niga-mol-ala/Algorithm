import java.util.Scanner;

public class bj1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String roomNum = sc.next();
		String[] roomNumArr = roomNum.split("");
	
		int[] arr = new int[10];
		
		for(int i = 0; i < roomNumArr.length; i++) {
			//6, 9일 경우 반대의 경우가 더 낮다면 해당값을 ++
			if (roomNumArr[i].equals("9") && arr[6] < arr[9]) {
					arr[6]++;
					continue;
			}
			
			if (roomNumArr[i].equals("6") && arr[9] < arr[6]) {
					arr[9]++;
					continue;
			}
		
			arr[Integer.parseInt(roomNumArr[i])]++;
		}
		
		//arr에 있는 최댓값이 필요한 세트의 개수.
		int answer = 0;
		for (int j = 0; j < arr.length; j++) {
			answer = Math.max(answer, arr[j]);
		}
		
		System.out.println(answer);
	}
}
