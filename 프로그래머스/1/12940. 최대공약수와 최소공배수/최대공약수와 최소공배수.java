class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int r = 1;
        int tn = n;
        int tm = m;
        while(r != 0){
            r = tn % tm;
            tn = tm;
            tm = r;
        }
        answer[0] = tn;
        answer[1] = (n * m) / tn;
        return answer;
    }
}