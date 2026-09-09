class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);

        int ans = 0;
        int count = 0;

        for (int i = nums.length - 1; i > 0; i--) {
            count++;

            if (nums[i] != nums[i - 1]) {
                ans += count;
            }
        }

        return ans;
    }
}