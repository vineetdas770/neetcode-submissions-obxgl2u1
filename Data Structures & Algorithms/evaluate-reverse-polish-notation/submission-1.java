class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens){
            if(s.equals("+")){
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                int output = a+b;
                stack.push(output);
            }
            else if(s.equals("-")){
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                int output = a-b;
                stack.push(output);
            }
            else if(s.equals("*")){
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                int output = a*b;
                stack.push(output);
            }
            else if(s.equals("/")){
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                int output = a/b;
                stack.push(output);
            }else {
                stack.push(Integer.valueOf(s));
            }
        }

        
        return stack.peek();
    }
}
