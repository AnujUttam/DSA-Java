class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        double sum = 0;
        double ans = Double.NEGATIVE_INFINITY;
        while(i < k){
            sum += nums[i];
            i++;
        }
        ans = sum/k;
        while(i < nums.length){
            sum = sum + nums[i] - nums[i - k];
            ans = Math.max(ans, sum/k);
            i++;
        }
        return ans;
    }
}