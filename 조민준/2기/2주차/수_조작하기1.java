class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        for(int i = 0; i < control.length(); i++) {
            if(control.charAt(i) == 'w'){			// w이면 +1
                n += 1;
            } else if(control.charAt(i) == 's'){	// s이면 -1
                n -= 1;
            } else if(control.charAt(i) == 'd'){	// d이면 +10
                n += 10;
            } else {								// a(나머지)이면 -10
                n -= 10;
            }
        }
        answer = n;
        return answer;
    }
}