class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s: strs){
            short []mp = new short[26];
            for(char c:s.toCharArray()){
                mp[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i:mp){
                sb.append(i).append("#");
            }
            res.putIfAbsent(sb.toString(),new ArrayList<>());
            res.get(sb.toString()).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
