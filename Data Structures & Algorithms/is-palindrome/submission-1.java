class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            char start = Character.toLowerCase(s.charAt(i));
            while(i<j && !Character.isLetterOrDigit(start)){
                i++;
                start = Character.toLowerCase(s.charAt(i));
            }
            char end = Character.toLowerCase(s.charAt(j));
            while(i<j && !Character.isLetterOrDigit(end)){
                j--;
                end = Character.toLowerCase(s.charAt(j));
            }
            if(i>=j){
                return true;
            }
            if(start!=end){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
