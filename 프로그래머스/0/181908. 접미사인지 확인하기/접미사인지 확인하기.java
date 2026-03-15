class Solution {
    public int solution(String my_string, String is_suffix) {
        return is_suffix.equals(my_string.substring(my_string.length() >= is_suffix.length() ? (my_string.length() - is_suffix.length()) : 0)) ? 1 : 0;
    }
}