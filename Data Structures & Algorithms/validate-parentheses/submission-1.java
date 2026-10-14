    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for(char c:s.toCharArray()){
                if(c==']'){
                    if(stack.isEmpty()) return false;
                    char pop = stack.pop();
                    if(pop!='['){
                        return false;
                    }
                }else if(c==')'){
                    if(stack.isEmpty()) return false;
                    char pop = stack.pop();
                    if(pop!='('){
                        return false;
                    }
                }else if (c=='}'){
                    if(stack.isEmpty()) return false;
                    char pop = stack.pop();
                    if(pop!='{'){
                        return false;
                    }
                }else{
                    stack.push(c);
                }
            }
            if(!stack.isEmpty()){
                return false;
            }
            return true;
        }
    }