package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1991_트리순회 {
	static int N;
	static String[] parent;
	static String[][] child;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine()); // 노드의 개수
		parent = new String[N];
		child = new String[N][2];

		// 노드의 이름 입력받기
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			parent[i] = st.nextToken();
			child[i][0] = st.nextToken();
			child[i][1] = st.nextToken();
		}
//		System.out.println(Arrays.toString(parent));
//		System.out.println(Arrays.deepToString(child));

		before(0);
		System.out.println();
		middle(0);
		System.out.println();
		after(0);

	} // main

	// 전위 순회 메서드
	public static void before(int idx) {
		System.out.print(parent[idx]); // V
		if (!child[idx][0].equals(".")) { // 왼쪽 자식이 있는 경우 L
			for (int i = 0; i < N; i++) {
				if (child[idx][0].equals(parent[i])) { // 그 자식에 해당하는 노드를 찾아
					before(i);
				}
			}
		}
		if (!child[idx][1].equals(".")) { // 오른쪽 자식이 있는 경우 R
			for (int i = 0; i < N; i++) {
				if (child[idx][1].equals(parent[i])) { // 그 자식에 해당하는 노드를 찾아
					before(i);
				}
			}
		}
	}

	// 중위 순회 메서드
	public static void middle(int idx) {
		if (!child[idx][0].equals(".")) { // 왼쪽 자식이 있는 경우 L
			for (int i = 0; i < N; i++) {
				if (child[idx][0].equals(parent[i])) { // 그 자식에 해당하는 노드를 찾아
					middle(i);
				}
			}
		}
		System.out.print(parent[idx]); // V
		if (!child[idx][1].equals(".")) { // 오른쪽 자식이 있는 경우 R
			for (int i = 0; i < N; i++) {
				if (child[idx][1].equals(parent[i])) { // 그 자식에 해당하는 노드를 찾아
					middle(i);
				}
			}
		}
	}

	// 후위 순회 메서드
	public static void after(int idx) {
		if (!child[idx][0].equals(".")) { // 왼쪽 자식이 있는 경우 L
			for (int i = 0; i < N; i++) {
				if (child[idx][0].equals(parent[i])) { // 그 자식에 해당하는 노드를 찾아
					after(i);
				}
			}
		}
		if (!child[idx][1].equals(".")) { // 오른쪽 자식이 있는 경우 R
			for (int i = 0; i < N; i++) {
				if (child[idx][1].equals(parent[i])) { // 그 자식에 해당하는 노드를 찾아
					after(i);
				}
			}
		}
		System.out.print(parent[idx]); // V
	}

}
