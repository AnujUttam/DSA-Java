class Solution {
    public int sum(int a){
        int sum = 0;
        while(a > 0){
            int rem = a % 10;
            sum += rem;
            a = a / 10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int sumOfDigits = sum(nums[i]);
            if(sumOfDigits == i){
                return i;
            }
        }
        return -1;
    }
}