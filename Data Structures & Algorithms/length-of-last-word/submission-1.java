class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder res = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isWhitespace(s.charAt(i)) && res.length()==0) continue;
            else if(Character.isWhitespace(s.charAt(i)) && res.length()>0){
                return res.length();
            }
            res.append(s.charAt(i));            
        }
        return res.length();
    }
}