class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int i=0,j=0;
        Set<Character> set = new HashSet<>();

        while(j<s.length()){
            char next = s.charAt(j);
            if(!set.contains(next)){
                res = Math.max(res, j-i+1);
                j++;                
            }else{
                char prev = ' ';
                do{
                    prev = s.charAt(i);
                    set.remove(prev);
                    i++;                    
                }while(set.contains(next) && i<=j);
                j++;
            }
            set.add(next);
        }
        return res;
    }
}
