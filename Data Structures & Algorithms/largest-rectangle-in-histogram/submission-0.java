class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Node> stack = new Stack<>();
        int max =0;
        for(int i=0;i<heights.length;i++){
            int start = i;

            while(!stack.isEmpty() && stack.peek().height>heights[i]){
                Node next = stack.pop();
                max = Math.max(max, (i-next.index)*next.height);
                start = next.index;
            }
            stack.push(new Node(start,heights[i]));
        }

        while(!stack.isEmpty()){
            Node next = stack.pop();
            max = Math.max(max,(heights.length-next.index)*next.height);
        }
        return max;
    }

    static class Node{
        int index;
        int height;
        public Node(int index,int height){
            this.index = index;
            this.height = height;
        }
    }
}