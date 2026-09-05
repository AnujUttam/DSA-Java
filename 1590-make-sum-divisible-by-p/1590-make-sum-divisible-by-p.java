class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int rem = (int)(sum % p);

        // Already divisible
        if (rem == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix remainder 0 exists before array starts
        map.put(0, -1);

        int prefix = 0;
        int ans = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefix = (prefix + nums[i]) % p;

            int required = (prefix - rem + p) % p;

            if (map.containsKey(required)) {
                int j = map.get(required);
                ans = Math.min(ans, i - j);
            }

            // Store latest index
            map.put(prefix, i);
        }

        // Whole array cannot be removed
        return ans == nums.length ? -1 : ans;
    }
}