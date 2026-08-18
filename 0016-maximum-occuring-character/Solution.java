class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        char ans = s.charAt(0);
        int maxf = 1;
        for (int i = 0; i < s.length(); i++) {
            int c = 1;
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) c++;
            }
            if(c>maxf) {
                maxf = c ;
                ans = s.charAt(i);
            }
            else if (c == maxf && s.charAt(i) <ans) ans = s.charAt(i);
        }
        return ans;
    }
}