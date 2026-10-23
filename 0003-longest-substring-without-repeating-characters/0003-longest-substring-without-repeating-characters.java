class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int right = 0, left = 0;
        HashSet<Character> set = new HashSet<>();
        int len = 0;

        while(right < n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                len  = Math.max(len, right - left + 1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return len;
    }
}