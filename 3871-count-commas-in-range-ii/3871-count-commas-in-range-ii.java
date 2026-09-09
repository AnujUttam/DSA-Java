class Solution {
    private long pow10(int exp) {
        long result = 1;

        for (int i = 0; i < exp; i++) {
            result *= 10;
        }

        return result;
    }
    public long countCommas(long n) {
        long ans = 0;

        // k = number of commas
        for (int k = 1; k <= 5; k++) {
            long start = pow10(3 * k);       // 1000, 1000000, ...
            
            if (start > n) break;

            long end = Math.min(n, pow10(3 * k + 3) - 1);

            long count = end - start + 1;

            ans += count * k;
        }

        return ans;
    }
}