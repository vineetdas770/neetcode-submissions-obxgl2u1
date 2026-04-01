class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i=0 ; i<temperatures.length ; i++){
            while(!stack.empty() && temperatures[i]>temperatures[stack.peek()]){
                int pop = stack.pop();
                result[pop] = i - pop;
            }
            stack.push(i);

        }
        return result;
        
    }
}
