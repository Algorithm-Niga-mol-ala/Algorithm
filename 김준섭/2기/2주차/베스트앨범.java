import java.util.*;

class Stream {
    int plays;
    int num;

    Stream(){}

    Stream(int plays, int num) {
        this.plays = plays;
        this.num = num;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> total = new HashMap<>();
        HashMap<String, Stream[]> best = new HashMap<>();

        for(int i = 0 ; i < genres.length; i++) {
            if(!best.containsKey(genres[i])) {
                Stream[] temp = new Stream[2];
                temp[0] = new Stream();
                temp[1] = new Stream();
                temp[1].plays = plays[i];
                temp[1].num = i;
                best.put(genres[i], temp);
            } else {
                if(best.get(genres[i])[1].plays < plays[i]) {
                    best.get(genres[i])[0].plays = best.get(genres[i])[1].plays;
                    best.get(genres[i])[0].num = best.get(genres[i])[1].num;
                    best.get(genres[i])[1].plays = plays[i];
                    best.get(genres[i])[1].num = i;
                } else if(best.get(genres[i])[0].plays < plays[i]) {
                    best.get(genres[i])[0].plays = plays[i];
                    best.get(genres[i])[0].num = i;
                }
            }

            if(!total.containsKey(genres[i])) {
                total.put(genres[i], plays[i]);
            } else {
                total.put(genres[i], total.get(genres[i]) + plays[i]);
            }
        }

        int[] ntotal = new int[total.size()];
        HashMap<Integer, String> name = new HashMap<>();

        int index = 0;
        for (String str : total.keySet()) {
            ntotal[index++] = total.get(str);
            name.put(total.get(str), str);
        }

        Arrays.sort(ntotal);
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = ntotal.length-1; i >= 0; i--) {
            String genre = name.get(ntotal[i]);
            if(best.get(genre)[1].plays != 0)
                result.add(best.get(genre)[1].num);
            if(best.get(genre)[0].plays != 0)
                result.add(best.get(genre)[0].num);
        }

        int[] answer = new int[result.size()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = result.get(i);

        return answer;
    }
}
