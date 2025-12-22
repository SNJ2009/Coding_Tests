class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder(code.length());
        boolean mode = false;
        
        for(int idx = 0; idx < code.length(); idx++){
            char codeChar = code.charAt(idx);
            if(codeChar == '1'){
                mode = !mode;
            } else if((idx & 1) == 0 ^ mode){ // ^ = XOR, & = AND
                sb.append(codeChar);         // 우선순위 & < == // => (idx & 1) == 0
            }
        }
        return sb.length() != 0 ? sb.toString() : "EMPTY";
    }
}