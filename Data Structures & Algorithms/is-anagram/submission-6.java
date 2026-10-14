class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        short counts[] = new short[26];
        for(int i=0;i<s.length();i++){
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
        }
        for(int i:counts){
            if(i!=0) return false;
        }
        return true;
    }
}
