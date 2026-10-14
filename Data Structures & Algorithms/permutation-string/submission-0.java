class Solution {
        public boolean checkInclusion(String s1, String s2) {
            int s1map[] = new int[26];

            for (char ch : s1.toCharArray()) {
                s1map[ch - 'a']++;
            }
            StringBuilder s1str = new StringBuilder();
            Arrays.stream(s1map).forEach(i -> s1str.append(i).append("#"));

            int s2map[] = new int[26];
            int j = 0;
            for (int i = 0; i < s2.length(); i++) {
                s2map[s2.charAt(i) - 'a']++;
                Pair validPair = valid(s2, j, s2map, s1map, s1str);
                while (i>=j&&!validPair.isValid) {
                    s2map[s2.charAt(j++)-'a']--;
                    validPair = valid(s2, j, s2map, s1map, s1str);
                }
                if (validPair.matchString.equals(s1str.toString())) {
                    return true;
                }
            }
            return false;
        }

        private Pair valid(String s2, int pos, int[] s2map, int[] s1map, StringBuilder s1str) {
            StringBuilder s2str = new StringBuilder();
            for (int ch=0; ch<26; ch++) {
                if (s2map[ch] > s1map[ch]) {
                    return new Pair("", false);
                }
                s2str.append(s2map[ch]).append("#");
            }
            return new Pair(s2str.toString(), true);
        }

        class Pair {
            public String matchString;
            public boolean isValid;

            public Pair(String matchString, boolean isValid) {
                this.matchString = matchString;
                this.isValid = isValid;
            }
        }
    }