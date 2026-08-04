class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b = stack.pop();
                int a = stack.pop();

                Integer val = switch(token){
                    case "+" -> a+b;
                    case "-" -> a-b;
                    case "*" -> a*b;
                    case "/" -> a/b;
                    default -> 0;
                };
                stack.push(val);
            }else{
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.peek();
    }
}