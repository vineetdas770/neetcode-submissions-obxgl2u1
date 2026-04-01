class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        for(int i=0 ; i < asteroids.length ; i++){

            while(!stack.empty() && stack.peek() > 0 && asteroids[i] < 0){
                int difference = asteroids[i] + stack.peek();
                if(difference<0){
                    stack.pop();
                }
                else if (difference > 0){
                    asteroids[i]=0;
                }
                else{
                    asteroids[i]=0;
                    stack.pop();
                }
                
            }
            if(asteroids[i]!=0){
            stack.push(asteroids[i]);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}