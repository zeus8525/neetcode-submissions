class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(res,n,0,0, new StringBuilder());
        return res;
    }

    public void dfs(List<String> res, int n, int left, int right, StringBuilder curr){
        // if(left == n || right == n) return;
        if(curr.length()==2*n){
            res.add(curr.toString());
            return;
        }
        if(left<n){
            dfs(res,n,left+1,right,curr.append("("));
            curr.deleteCharAt(curr.length()-1);
        }
        if(right < n && left > right){
            dfs(res,n,left,right+1,curr.append(")"));
            curr.deleteCharAt(curr.length()-1);
        }           
        
    }
}
