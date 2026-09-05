class Solution {
    public int waysToMakeFair(int[] nums) {
         int n = nums.length;

        int[] evenPrefix = new int[n];
        int[] oddPrefix = new int[n];

        // Prefix sums
        for (int i = 0; i < n; i++) {

            if (i > 0) {
                evenPrefix[i] = evenPrefix[i - 1];
                oddPrefix[i] = oddPrefix[i - 1];
            }

            if (i % 2 == 0) {
                evenPrefix[i] += nums[i];
            } else {
                oddPrefix[i] += nums[i];
            }
        }

        int totalEven = evenPrefix[n - 1];
        int totalOdd = oddPrefix[n - 1];

        int ans = 0;

        for (int i = 0; i < n; i++) {

            // Left side
            int leftEven = 0;
            int leftOdd = 0;

            if (i > 0) {
                leftEven = evenPrefix[i - 1];
                leftOdd = oddPrefix[i - 1];
            }

            // Right side
            int rightEven = totalEven - evenPrefix[i];
            int rightOdd = totalOdd - oddPrefix[i];

            // Right side changes parity after removal
            int newEven = leftEven + rightOdd;
            int newOdd = leftOdd + rightEven;

            if (newEven == newOdd) {
                ans++;
            }
        }

        return ans;
    }
}