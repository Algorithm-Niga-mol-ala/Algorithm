import java.util.*;
import java.io.*;

class Solution {
    public String solution(String phone_number) {
        
        String answer = "";
        
        String[] number = phone_number.split("");
        
        for(int i = 0; i < number.length-4; i++){
            number[i] = "*";
        }
        
        for(int i = 0; i < number.length; i++){
            answer += number[i];
        }
        

        return answer;
    }
}
