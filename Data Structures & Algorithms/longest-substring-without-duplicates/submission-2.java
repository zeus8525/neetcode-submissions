class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        while(j<s.length()){
            char nxt = s.charAt(j);
            if(map.containsKey(nxt)){
                i = Math.max(i, map.get(nxt)+1);
            }
            max = Math.max(max, j-i+1);
            map.put(nxt,j);
            j++;
        }
        return max;
    }
}
