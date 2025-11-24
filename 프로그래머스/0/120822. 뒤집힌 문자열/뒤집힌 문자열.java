class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        my_string = sb.reverse().toString();
        return my_string;
    }
}