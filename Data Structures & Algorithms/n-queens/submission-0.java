class Solution {
        int hill[] = null;//right to left
        int dale[] = null;//left to right
        int row[] = null;
        int col[] = null;

        public List<List<String>> solveNQueens(int n) {
            hill = new int[2*n];
            dale = new int[2*n];
            row = new int[n];
            col = new int[n];
            List<List<String>> res = new ArrayList<>();
            List<StringBuilder> curr = new ArrayList<>();
            for(int k=0;k<n;k++){
                StringBuilder m = new StringBuilder();
                for(int s=0;s<n;s++){
                    m.append(".");
                }
                curr.add(m);
            }
            for(int j=0;j<n;j++){
                dfs(n,res,curr,0,j);
            }
            return res;
        }

        public void dfs(int n, List<List<String>> res,
                        List<StringBuilder> curr, int i, int j){
            if(i<0 || j<0 || i>=n||j>=n){
                return;
            }
            if(!safe(i,j,n)){
                return;
            }
            place(i,j,n,1);
            StringBuilder sb = curr.get(i);
            sb.setCharAt(j,'Q');
            if(i==n-1){
                List<String> currRes = new ArrayList<>();
                for(StringBuilder row:curr){
                    currRes.add(row.toString());
                }
                res.add(currRes);
                sb.setCharAt(j,'.');
                place(i,j,n,0);
                return;
            }
            for(int m=0;m<n;m++){
                dfs(n,res,curr,i+1,m);
            }
            sb.setCharAt(j,'.');
            place(i,j,n,0);
        }

        public boolean safe(int i, int j, int n){
            if(row[i]>0 || col[j] > 0
                    || hill[i+j]>0 || dale[j-i+n-1]>0){
                return false;
            }
            return true;
        }

        private void place(int i, int j, int n,int val){
            row[i] = val;
            col[j] = val;
            hill[i+j] = val;
            dale[j-i+n-1] = val;
        }
    }