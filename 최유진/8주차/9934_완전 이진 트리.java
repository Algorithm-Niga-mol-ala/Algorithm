package algo;

import java.util.Scanner;

public class bj9934 {

	public static int num;
	public static int[] arr;
	public static int[] ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		num = (int) Math.pow(2, K) - 1; // 전체 노드의 개수.
		arr = new int[num + 1]; // 1번부터 num번까지.
		ans = new int[num + 1];

		for (int i = 1; i <= num; i++) {
			arr[i] = sc.nextInt();
		}
		

		go(1, 1); // 가장 루트노드부터 시작.
		
		//1, 2 ~3, 4~ 7, 8 ~ 15번 출력하겠다.
		for(int j = 1; j <= K; j++) {
			int st = (int) Math.pow(2, j-1);
			int ed = (int) Math.pow(2, j) - 1;
			for(int i = st; i <= ed; i++) {
				if(i == ed) {
					System.out.print(ans[i]);
				} else {
					System.out.print(ans[i] + " ");
				}
			}
			System.out.println(" ");
		}


	}

	public static void go(int n, int idx) { //n은 채워줘야할 노드 번호, idx는 인덱
		if (idx > num) {
			return; // 넣을 노드의 인덱스가 노드개수를 초과한다면 리턴.
		}

		if (n == 0) { 
			return; // 모든 idx가 다 채워졌으므로 리턴.
		}

		//왼쪽 자식의 빌딩에 아직 들어가지 않았다면 이동.
		if(n * 2 <= num && ans[n * 2] == 0) {
			go(n * 2, idx);
		}
		
		//왼쪽 자식이 없거나 왼쪽 자식빌딩을 이미 들어갔다면,
		if((n * 2 > num || ans[n * 2] != 0) && ans[n] == 0) {
			//현재 노드에 있는 빌딩을 들어간다.
			ans[n] = arr[idx++];
		}
		
		//현재 빌딩을 이미 들어갔고, 오른쪽 자식이 있는데 비어 있는 경우에
		if(ans[n] != 0 && n * 2 + 1 <= num && ans[n*2 + 1] == 0) {
			//오른쪽으로 이동한다.
			go(n * 2 +1, idx);
		}
		
		//오른쪽 자식이 있는데 채워줬단 얘기는.
		if(n * 2 + 1 > num || ans[n*2 + 1] != 0) {
			go(n / 2, idx); // 이제 부모를 채워줄 차례.
		}



	}

}
