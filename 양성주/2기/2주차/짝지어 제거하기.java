import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 1;
       Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(!stack.isEmpty()&&stack.peek() == a) stack.pop();
            else stack.add(a);
        }
        if(!stack.isEmpty()){
            answer = 0;
        }
        
        return answer;
    }
}

//시간초과코드
class Solution
{
    public int solution(String s)
    {
        int answer = 1;
        LinkedList<Character> list = new LinkedList<Character>();

        for(int i=0;i<s.length();i++) {
        	list.add(s.charAt(i));
        }

        while(!list.isEmpty()){
           int cnt = 0;
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i) == list.get(i+1)){
                    list.remove(i);
                    list.remove(i);
                    cnt++;
                    continue;
                }
            }
            if(cnt == 0){
                answer = 0;
                break;
            }
        }

        return answer;
    }
}
