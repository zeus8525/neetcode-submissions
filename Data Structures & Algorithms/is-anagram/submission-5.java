class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        short counts[] = new short[26];
        for(char c:s.toCharArray()){
            counts[c-'a']++;
        }
        for(char c:t.toCharArray()){
            counts[c-'a']--;
        }
        for(int i:counts){
            if(i!=0) return false;
        }
        return true;
    }
}
