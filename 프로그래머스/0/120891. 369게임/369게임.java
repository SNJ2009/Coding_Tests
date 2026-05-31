class Solution {
    public int solution(int order) {
        int count = 0;
        String toStr = String.valueOf(order);

        for(String s : toStr.split("")) {
            if (s.matches("[369]")) {
                count++;
            }
        }
        return count;
    }
}