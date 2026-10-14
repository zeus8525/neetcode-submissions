class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek() - i;
            }else{
                result[i]=0;
            }
            stack.push(i);
        }
        return result;
    }
}
