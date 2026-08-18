class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int[] freq = new int[26];
        char ans = s.charAt(0);
        int i =0;
        while(i<s.length()){
            freq[s.charAt(i++) - 97]++;
        }
        for(int i1 =0;i1<26;i1++){
            if(freq[i1] == 1) {
                ans = (char)(i1 + 97);
                break;
            }
        }
        return ans;
    }
}