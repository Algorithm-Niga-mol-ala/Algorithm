import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

class Node {
	int value;
	int left;
	int right;
	
	public Node(int value) {
		this.value = value;
	}
	
}

public class Main {
	static int N;
	static StringBuilder sb;

	static ArrayList<Node> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();

		N = Integer.parseInt(br.readLine());
		// 노드의 개수

		list = new ArrayList<>();
		//ArrayList로 트리 만듦
		for (int i = 0; i < N; i++) {
			char[] PC = br.readLine().toCharArray();
			//입력 받은 값을 char 배열로 바꿔줌.
			//숫자로 바꿀 수 있어야 계산이 편해서
			list.add(new Node(PC[0] - 'A'));
			

			if (PC[2] != '.' && PC[4] != '.') {
				list.get(i).left = PC[2] - 'A';
				list.get(i).right = PC[4] - 'A';

			} else if (PC[2] != '.') {
				list.get(i).left = PC[2] - 'A';
				list.get(i).right = -1;

			} else if (PC[4] != '.') {
				list.get(i).right = PC[4] - 'A';
				list.get(i).left = -1;

			} else {
				list.get(i).left = -1;
				list.get(i).right = -1;
			}

		} // 트리 만들기

		preorder(0);
		sb.append("\n");
		inorder(0);
		sb.append("\n");
		postorder(0);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	static void preorder(int idx) {
		int tmp=0;
		sb.append((char) (idx + 'A'));
		for (int i = 0; i < N; i++) {
			if (list.get(i).value == idx) {
				//list.get(i) 하면 Node가 반환되고 그것의 value 값
				//B D . 이 입력되면 idx=1일 때 B의 왼쪽 노드가 D니까 3인데 
				//입력된 순서 때문에 list.get(3)을 하면 E가 선택이 됨
				//그래서 D의 인덱스를 찾아서 넣어주기 위해
				tmp = i;
			}
		}
		if (list.get(tmp).left >= 0) {
			preorder(list.get(tmp).left);
		}
		if (list.get(tmp).right >= 0) {
			preorder(list.get(tmp).right);
		}

	}

	static void inorder(int idx) {
		int tmp = 0;
		for (int i = 0; i < N; i++) {
			if (list.get(i).value == idx) {
				tmp = i;
			}
		}
		if (list.get(tmp).left > 0) {
			inorder(list.get(tmp).left);
		}
		sb.append((char) (idx + 'A'));
		if (list.get(tmp).right > 0) {
			inorder(list.get(tmp).right);
		}
	}

	static void postorder(int idx) {
		int tmp =0;
		for (int i = 0; i < N; i++) {
			if (list.get(i).value == idx) {
				tmp = i;
			}
		}
		if (list.get(tmp).left > 0) {
			postorder(list.get(tmp).left);
		}
		if (list.get(tmp).right > 0) {
			postorder(list.get(tmp).right);
		}
		sb.append((char) (idx + 'A'));
	}

}

