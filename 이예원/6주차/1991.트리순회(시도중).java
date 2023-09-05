package boj;

import java.util.Arrays;
import java.util.Scanner;

public class Boj_1991_트리순회 {

    //이진트리를 입력받아 전위, 중위, 후위 순회한 결과를 출력
    
    
    //입력
    //이진트리의 노드 개수 N이 주어진다.
    //둘째 줄부터 N개의 줄에 걸쳐 각 노드와 왼자, 오자가 주어진다.
    //A부터 차례대로 이름 매겨지고, A가 항상 루트노드
    //자식 노드가 없는 경우에는 .
    
    //출력
    //첫째 둘째 셋째줄에 각각 전위 중위 후위 순회한 결과를 출력
    
    
    //배열에 저장을 우찌하지?
    
    //처음에 나오는 A => 무조건 루트노드, [0]에 저장
    //나 , 왼자, 오자 나오니까 나 =>[i],왼자 =>[i*2],오자 =>[i*2+1]에 저장
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //노드의 개수
        
        String[] tree = new String[N*2]; //노드를 담을 배열 (모자를 것 같아서 N*2 크기로 만들어봄)
        
        for(int i = 0; i < N; i++) {
            
            String input1 = sc.next();
            String input2 = sc.next();
            String input3 = sc.next();
            
            if(input1 == "A") { //입력값이 A면 무조건 루트노드, 왼자 오자 값도 입력해주기
                tree[0] = input1;
                tree[1] = input2;
                tree[2] = input3;

            }else { //A가 아니라면 나, 왼자, 오자 값 입력해주기
                tree[i] = input1;
                tree[i*2] = input2;
                tree[(i*2)+1] = input3;
            }
            
            System.out.println(Arrays.toString(tree));
        }//노드입력
        

    }//main
    


}
