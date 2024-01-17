import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < moves.length; i++){
            
            int col = moves[i]-1;
            
            // board.length == board의 row 길이
            loop : for(int r = 0; r < board.length; r++){
                
                if(board[r][col] != 0){ // 인형 찾음
                    
                    if(stack.isEmpty()){ //stack이 비어있으면 push 후 다음 턴
                        stack.push(board[r][col]);
                        board[r][col] = 0;
                        break loop;
                    }else{
                        if(stack.peek() == board[r][col]){ //같은 인형이면 count & 터짐
                            stack.pop();
                            board[r][col] = 0;
                            answer += 2;
                            break loop;
                        }else{ //다른 인형이면 push
                            stack.push(board[r][col]);
                            board[r][col] = 0;
                            break loop;
                        }
                    }
                    
                }

            }

            
        } //for of move

        return answer; 
    }
}
