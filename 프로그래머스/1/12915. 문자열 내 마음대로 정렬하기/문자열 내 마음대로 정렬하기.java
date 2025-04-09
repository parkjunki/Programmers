import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        List<String> list = Arrays.asList(strings);
        
        return list.stream().sorted((s1,s2) -> (s1.charAt(n) == s2.charAt(n)) ? s1.compareTo(s2) : Character.compare(s1.charAt(n), s2.charAt(n))).toArray(String[]::new);
        
    }
}