class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (String s : operations){
            if(s.equals("+")){
                int top = stack.pop();
                int top1 = stack.peek();
                stack.push(top);
                stack.push(top+top1);
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("D")){
                int temp = stack.peek();
                stack.push(temp*2);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        
        
        for(int i : stack) {
            sum += i;
        }

        return sum;
        
    }
}