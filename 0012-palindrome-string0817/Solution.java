class Solution {
    boolean isPalindrome(String s) {
        // code here
        int i = 0,j = s.length()-1;
        for(; i < s.length()/2;i++ ){
            if(s.charAt(i) != s.charAt(j)) return false;
            j--;
        }
        return true;
    }
}