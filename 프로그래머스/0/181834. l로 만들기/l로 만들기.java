class Solution {
    public String solution(String myString) {
//         StringBuilder sb = new StringBuilder();
//         int len = myString.length();
        
//         for(int i = 0; i < len; i++){
//             char ch = myString.charAt(i);
//             if()
//         }
//         return answer;
        
        for(char i = 'a'; i < 'l'; i++){
            myString = myString.replace(i, 'l');
        }
        return myString;
    }
}