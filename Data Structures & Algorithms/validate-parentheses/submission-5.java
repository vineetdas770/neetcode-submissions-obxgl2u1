class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for (Character c : s.toCharArray()){
            if(c.equals('(') || c.equals('[') || c.equals('{')){
                stack.push(c);
            }else{
                if(!stack.empty() && stack.peek().equals(map.get(c))){
                    stack.pop();
                }else{
                    return false;
                }
            }
            
        }

        if(stack.empty()){
            return true;
        }

        return false;
        
    }
}
