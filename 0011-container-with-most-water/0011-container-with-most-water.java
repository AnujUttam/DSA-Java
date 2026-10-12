class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int a = 0;
        while(l < r){
            int minH = Math.min(height[l], height[r]);
            int w = r - l;
            a = Math.max(a, minH * w);

            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return a;
    }
}