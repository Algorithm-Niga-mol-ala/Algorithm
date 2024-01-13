import java.util.*;

class Solution {
     public String[] solution(String[] record){

        Queue<user> users = new LinkedList<>();
        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<record.length; i++){
            String[] cmd = record[i].split(" ",0);
            String state = cmd[0];
            String id = cmd[1];
            String nickname;
            
            switch(state){
                case "Enter":
                	nickname = cmd[2];
                    map.put(id,nickname);
                    users.add(new user(id,state));
                    break;
                case "Leave":
                    users.add(new user(id,state));
                    break;
                case "Change":
                	nickname = cmd[2];
                    map.put(id,nickname);
                    break;
            }
        }
        String [] answer = new String[users.size()];
        int size = users.size();
        for(int i=0; i<size; i++){
            user now = users.poll();
          
            if(now.state.equals("Enter")){
                answer[i]=map.get(now.id)+"님이 들어왔습니다.";
            }else{
                answer[i]=map.get(now.id)+"님이 나갔습니다.";
            }
        }
         return answer;
    }
}

class user{
    String id;
    String state;
    
    user(String id , String state){
        this.id = id;
        this.state = state;
    }
}
