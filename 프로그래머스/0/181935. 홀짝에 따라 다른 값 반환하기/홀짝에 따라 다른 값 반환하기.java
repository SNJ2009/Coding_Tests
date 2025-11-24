class Solution {
    public int solution(int n) {
        int re = 0;
        boolean hj = n % 2 == 0;
        // for(int i = 0; i < n; i++){ // 0 < 7 = t // 1 < 5 = t // 2 < 3 == t
        //     re += hj ? n * n : n; // 0 += 7 // 7 += 5 // 13 += 3 // 15 += 1 // 16
        //     n -= 2; // 5 3 1 -1
        // }
        
        while(n > 0){
            re += hj ? n * n : n;
            n -= 2;
        }
        return re;
    }
}