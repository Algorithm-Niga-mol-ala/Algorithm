package algo;

import java.util.Scanner;

public class bj1991 {

	public static String[] tree;
	public static String[][] child;
	public static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		tree = new String[N];
		child = new String[N][2]; // 자식 정보 저장.
		sc.nextLine();

		for (int i = 0; i < N; i++) { //
			String[] line = sc.nextLine().split(" ");
			tree[i] = line[0];
			child[i][0] = line[1];
			child[i][1] = line[2];
		}

		preorder(0);
		System.out.println("");
		order(0);
		System.out.println("");
		postorder(0);
	}

	public static void preorder(int i) { //전위.
		System.out.print(tree[i]); //루트 노드 프린트
    
		if (!child[i][0].equals(".")) { // 왼쪽 자식이 있다면.
			for(int j = 0; j < N; j++) {
				if(tree[j].equals(child[i][0])) { //인덱스르 돌면서 자식 원소에 해당하는 정보를 찾습니다.
          // Q. i * 2 가 자식 노드인데 굳이 for문 안 돌고 하면 안 되나요?
          // A. 문제의 입력에서 A, B, C, D .. 순서로 주고 있지 않습니다. 따라서 인덱스에 *2 했더니 원하는 값이 나오지 않았어요!
					preorder(j);
				}
			}
		}
    
		if (!child[i][1].equals(".")) { // 오른쪽 자식이 있다면.
			for(int j = 0; j < N; j++) {
				if(tree[j].equals(child[i][1])) {
					preorder(j);
				}
			}
		}
	}
	
	public static void order(int i) { //중위.
		if (!child[i][0].equals(".")) { // 왼쪽 자식이 있다면.
			for(int j = 0; j < N; j++) {
				if(tree[j].equals(child[i][0])) {
					order(j);
				}
			}
		}
		System.out.print(tree[i]);
		if (!child[i][1].equals(".")) { // 오른쪽 자식이 있다면.
			for(int j = 0; j < N; j++) {
				if(tree[j].equals(child[i][1])) {
					order(j);
				}
			}
		}
	}
	
	public static void postorder(int i) { //후위.
		if (!child[i][0].equals(".")) { // 왼쪽 자식이 있다면.
			for(int j = 0; j < N; j++) {
				if(tree[j].equals(child[i][0])) {
					postorder(j);
				}
			}
		}
		if (!child[i][1].equals(".")) { // 오른쪽 자식이 있다면.
			for(int j = 0; j < N; j++) {
				if(tree[j].equals(child[i][1])) {
					postorder(j);
				}
			}
		}
		System.out.print(tree[i]);
	}

}
