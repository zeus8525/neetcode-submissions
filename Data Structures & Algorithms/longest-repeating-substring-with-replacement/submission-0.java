class Solution {
        public int characterReplacement(String s, int k) {
            int map[] = new int[26];
            int i=0,j=0;
            int res = 0;
            while(j<s.length()){
                map[s.charAt(j)-'A']++;

                while(!isLowestLessThanK(s,k,map)){
                    map[s.charAt(i)-'A']--;
                    i++;
                }                
                res = Math.max(res, j-i+1);
                j++;
            }
            return res;
        }

        private boolean isLowestLessThanK(String s, int k, int map[]){
            int mx = 0;
            int sum = 0;
            for(int i=0;i<26;i++){
                mx = Math.max(mx,map[i]);
                sum += map[i];
            }
            if(sum-mx>k){
                return false;
            }
            return true;
        }
    }