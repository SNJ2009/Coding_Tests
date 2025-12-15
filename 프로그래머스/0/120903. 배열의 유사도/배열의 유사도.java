import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> s1Set = new HashSet<>();
        for(String i : s1){
            s1Set.add(i);
        }
        
        Set<String> s2Set = new HashSet<>();
        for(String i : s2){
            s2Set.add(i);
        }
        
        Set<String> union = new HashSet<>(s1Set);
        union.retainAll(s2Set);
        
        return union.size();
    }
}