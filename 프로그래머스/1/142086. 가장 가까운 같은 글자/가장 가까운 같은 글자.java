import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[s.length()];

        StringBuilder sb = new StringBuilder();
        answer[0] = -1;
        sb.append(s.substring(0,1));
        
        for(int i=1; i<s.length(); i++) {
            int idx = sb.toString().lastIndexOf(s.substring(i,i+1));
            if(idx == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - idx;
            }
            sb.append(s.substring(i,i+1));
        }
        
        return answer;
    }
}