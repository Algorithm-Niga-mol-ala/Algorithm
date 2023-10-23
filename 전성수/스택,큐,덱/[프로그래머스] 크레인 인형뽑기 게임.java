import java.util.Stack;

public class Solution {
	public int solution(int[][] board, int[] moves) {
    
		int answer = 0;
		Stack<Integer> st = new Stack<>();
    //뽑힌 인형을 넣어줄 스택
		for (int i = 0; i<moves.length; i++) {
      //뽑을 위치를 정하는 moves의 길이만큼 반복
			int command = moves[i]-1;
      //예제에서 위치는 1~5로 주어졌으니까 index로 쓰기위해 -1
			int idx = 0;
      //board 배열의 행
			while (true) {
				if (idx >= board.length)
					break;
        //열이 비어있으면 break
				int target = board[idx][command];
        //뽑힐 인형
				if (target != 0) {//인형이 있다면
                    board[idx][command]=0;
          //인형을 뽑았으니까 0으로 만들어주고 
					if (!st.isEmpty() && st.peek() == target) {
						st.pop();
						answer+=2;
						break;
					}//스택을 확인해서 같은 인형이라면 둘다 제거하고 +2 break;
					st.push(target);
					break;
          //아니면 스택에 넣고 break
				}
				idx++;
			}

		}

		return answer;
	}
}
