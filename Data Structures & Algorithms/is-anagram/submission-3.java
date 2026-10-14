class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int scount[]=new int[26];
        int tcount[] = new int[26];

        for(int i = 0;i<s.length();i++){
            scount[s.charAt(i)-'a']++;
            tcount[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(scount[i]!=tcount[i]) return false;
        }
        return true;
    }
}
