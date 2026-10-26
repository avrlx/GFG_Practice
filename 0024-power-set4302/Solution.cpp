class Solution {
  public:
    void solve(string s , int index , string output,vector<string> & ans){
        if ( index >= s.size()){
            ans.push_back(output);
            return;
        }
        char ch = s[index];
        solve(s, index +1 , output, ans);
        output.push_back(ch);
        solve ( s, index + 1 , output, ans);
    }
    vector<string> powerSet(string &s) {
        // Code here
        vector<string> ans;
        solve(s,0 , "",ans);
        sort(ans.begin(),ans.end());
        return ans;
    }
};