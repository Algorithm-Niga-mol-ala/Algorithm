
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        // L : 커서를 왼쪽으로 한 칸 옮김 (이미 맨 앞이면 무시됨)
        // D : 커서를 오른쪽으로 한 칸 옮김 (이미 맨 뒤면 무시됨)
        // B : 커서 왼쪽에 있는 문자를 삭제 (맨 앞이면 무시됨)
        // P$ : $라는 문자를 커서 왼쪽에 추가함

        // 길이가 L인 문자열이 현재 편집기에 입력되어 있으면, 커서가 위치할 수 있는 곳은 L+1가지 경우가 있다

        // 초기에 편집기에 입력돼 있는 문자열이 주어지고, 그 이후 입력한 명령어가 차례로 주어졌을 때
        // 모든 명령어를 수행하고 난 후 편집기에 입력되어 있는 문자열을 구해라
        // 단, 명령어가 수행되기 전에 커서는 문장의 맨 뒤에 위치하고 있다

        // 입력
        // 첫째 줄에는 초기에 편집기에 입력되어 있는 문자열이 주어짐
        // 둘째 줄에는 입력할 명령어의 개수 M
        // 셋째 줄부터 M개의 줄에 걸쳐 입력할 명령어가 순서대로 주어짐

        // 출력
        // 모든 명령어를 수행한 후 입력되어 있는 문자열 출력


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Stack<Character> stack1 = new Stack<>(); // 내 커서가 있는 편집기
        Stack<Character> stack2 = new Stack<>(); // L, D가 나왔을 때 활용할 스택

        String str = br.readLine(); // 문자열 입력

        char[] arr = new char[str.length() + 1]; // 문자열 길이+1의 배열 생성

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = str.charAt(i);
            stack1.push(arr[i]);
        } // 배열에 문자열 하나씩 잘라서 입력하면서 동시에 stack1에 push

        int M = Integer.parseInt(br.readLine()); // 입력할 명령어의 개수

        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine());
            
            String input = st.nextToken();

            if (input.equals("L")) { // 커서를 왼쪽으로 한칸 움직이라는 명령어
                if (!stack1.isEmpty()) { // 스택1이 비어있지 않다묜!
                    stack2.push(stack1.pop()); // 스택1에서 뽑아서 스택2로 push
                } else // 스택1이 비어있다면 (커서가 맨 왼쪽에 있다면)
                    continue; // 넘어가삼

            } else if (input.equals("D")) { // 커서를 오른쪽으로 한칸 움직이라는 명령어
                if (!stack2.isEmpty()) { // 스택2가 비어있지 않다묘ㅕㄴ
                    stack1.push(stack2.pop()); // 스택2에서 뽑아서 스택1로 push
                } else // 스택2가 비어있다면 (커서가 맨 오른쪽에 있다면)
                    continue; // 넘어가라

            } else if (input.equals("B")) { // 커서 왼쪽에 있는 문자를 삭제하라는 명령어
                if (!stack1.isEmpty()) { // 스택1이ㅣ 비어있지 않다면
                    stack1.pop(); // 삭제
                } else // 커서가 맨 앞이면 넘어가삼
                    continue;

            } else { // 커서 왼쪽에 문자 추가하는 명령어
                stack1.push(st.nextToken().charAt(0)); //흠...이러면될까....

            }

        } // 명령어 입력 반복문
        int size2 = stack2.size();
        
        for(int i = 0; i < size2; i++) {
            stack1.push(stack2.pop());
        } //stack2에 있는 요소(커서오른쪽에있는요소들) stack1에 push해주기
        
        int size = stack1.size();
        char[] res = new char[size];
        
        for(int i = 0; i < size; i++) {
            res[i] = stack1.pop();
        } //stack1에 있는 문자들 배열에 담아주기 
        
        for(int i = res.length-1; i >= 0; i--) {
            System.out.print(res[i]); //출력~!~!~!!~
        }

    }// main

}
