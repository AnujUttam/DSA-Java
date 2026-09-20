class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int n =  s.length();
        for(int i = 0; i < n; i++){
            char c  = s.charAt(i);
            int value = 26 - (c - 'a');
            ans += value * (i + 1);
        }
        return ans;
    }
}