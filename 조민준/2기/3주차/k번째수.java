import java.util.*;

class k번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int N = commands.length;	// commands 2차원배열의 크기
		
		int[] answer = new int[N];	// 2차원배열의 크기만큼 배열이 쌓이기 때문에 new int[N]
		
		for(int i = 0; i < N; i++) {	// N번 반복
			int[] temp = new int[commands[i][1] - commands[i][0] + 1];	// temp의 크기 ex) {2, 5, 3} 이면 5 - 2 + 1 = 4개  			
			int idx = 0;	// temp 배열의 index 값
			
			for(int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {	// a 부터 b까지 이기 때문에 j <= commands[i][1]
				temp[idx++]= array[j];	// 인덱스++ 로 temp 배열의 값을 제대로 넣어줌
			}
			
			Arrays.sort(temp);	// 정렬
			
			answer[i] = temp[commands[i][2] - 1];	// commands[i][2] - 1번째의 값을 담아준다
		}
        
        return answer;
    }
}
