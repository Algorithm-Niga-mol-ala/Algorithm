import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] seoul) {
        
        int check = 0;
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("김서방은 ");
        
        for(int i = 0; i < seoul.length; i++){
            
            if(seoul[i].equals("Kim")){
                break;
            }else{
                check++;
            }
        }
        
        sb.append(check).append("에 있다");
        
        
        
        return sb.toString();
        
        
    }
}
