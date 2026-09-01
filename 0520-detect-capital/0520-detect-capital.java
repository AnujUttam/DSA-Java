class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(n - 1))){
            for(int i = 1; i < n - 1; i++){
                if(Character.isLowerCase(word.charAt(i))) return false;
            }
        }

        if(Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(word.charAt(n - 1))){
            for(int i = 1; i < n - 1; i++){
                if(Character.isUpperCase(word.charAt(i))) return false;
            }
        }

        if(Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(n - 1))){
            return false;
        }

         if(Character.isLowerCase(word.charAt(0)) && Character.isLowerCase(word.charAt(n - 1))){
            for(int i = 1; i < n - 1; i++){
                if(Character.isUpperCase(word.charAt(i))) return false;
            }
        }
        return true;
    }
}