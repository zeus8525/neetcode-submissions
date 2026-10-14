class Solution {
    public boolean validWordSquare(List<String> words) {
        for(int i=0;i<words.size();i++){
            for(int j=0;j<words.get(i).length();j++){
                try{
                    if(words.get(i).charAt(j)!=words.get(j).charAt(i)){
                        return false;
                    }    
                }catch(Exception e){
                    return false;
                }
                
            }
        }
        return true;
    }
}
