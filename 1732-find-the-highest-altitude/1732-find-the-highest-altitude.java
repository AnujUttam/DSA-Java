class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] prefix = new int[n + 1];
        prefix[0] = 0;

        int ans = Integer.MIN_VALUE;
        ans = Math.max(ans, prefix[0]);

        for(int i = 1; i < n + 1; i++){
            prefix[i] = prefix[i - 1] + gain[i - 1];
            ans = Math.max(ans, prefix[i]);
        }
        return ans;
    }
}