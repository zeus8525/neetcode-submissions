class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<Node> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    q.offer(new Node(i,j,0));
                }
            }
        }
        
        while(!q.isEmpty()){
            int x[] = new int[]{1,0,-1,0};
            int y[] = new int[]{0,1,0,-1};

            Node poll = q.poll();
            if(poll.i<0||poll.j<0||poll.i>=grid.length
                ||poll.j>=grid[0].length){
                continue;
            }
            if(grid[poll.i][poll.j] < poll.cnt
                ||grid[poll.i][poll.j]==-1){
                continue;
            }
            grid[poll.i][poll.j] = poll.cnt;
            for(int i=0;i<x.length;i++){
                q.offer(new Node(poll.i+x[i],poll.j+y[i],poll.cnt+1));
            }
        }
    }

    class Node{
        int i;
        int j;
        int cnt;
        public Node(int i, int j, int cnt){
            this.i=i;
            this.j=j;
            this.cnt = cnt;
        }
    }
}
