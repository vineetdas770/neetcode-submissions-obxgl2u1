class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                sb.append(c);
            }
        }
        String str = sb.toString().toLowerCase();
        int left = 0;
        int right = str.length() -1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}
