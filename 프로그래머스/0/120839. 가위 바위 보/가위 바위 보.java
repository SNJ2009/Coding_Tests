import java.util.HashMap;

class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, String> map = new HashMap<>();
        
        map.put('2', "0"); // 가위, 바위
        map.put('0', "5"); // 바위, 보
        map.put('5', "2"); // 보, 가위

        for (char c : rsp.toCharArray()) {
            sb.append(map.get(c));
        }

        return sb.toString();
    }
}