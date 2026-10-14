class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        boolean dp[][] = new boolean[s.length()][s.length()];
        String res = "";
        for(int i=0;i<s.length();i++){
            dp[i][i] = true;
            res = s.charAt(i)+"";
        }
        for(int j=1;j<s.length();j++){
            for(int i=0;i<s.length()-j;i++){                
                if(s.charAt(i)==s.charAt(i+j)){
                    int m = i+1;
                    int n = i+j-1;
                    if(m<=n){
                        if(dp[m][n]){
                            dp[i][i+j] = true;
                            if(res.length() <= j){
                                res = s.substring(i,i+j+1);
                            }
                        }else{
                            dp[i][i+j] = false;
                        }
                    }else if(j==1){
                        dp[i][i+j] = true;
                        if(res.length() <= j){
                            res = s.substring(i,i+j+1);
                        }
                    }
                }                
            }
        }        
        return res;
    }
}
