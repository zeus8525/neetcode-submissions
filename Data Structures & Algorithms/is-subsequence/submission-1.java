class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int n = 0;
        boolean found = false;
        for(int i=0;i<s.length();i++){
            for(int j=n;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    n++;
                    found = true;
                    break;
                }
                n++;
            }
            if(!found) return false;
            if(i==s.length()-1) return true;
            found = false;
        }
        return false;
    }
}