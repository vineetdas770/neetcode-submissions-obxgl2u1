class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] ch1 = new int[26];
        int window = s1.length();
        int left = 0;

        for(char c : s1.toCharArray()){
            ch1[c-'a']++;
        }

        while(window<=s2.length()){

            String temp = s2.substring(left,window);
            int[] ch2 = new int[26];
            
            for(char c : temp.toCharArray()){
                ch2[c-'a']++;
            }
            
            boolean flag = Arrays.equals(ch1,ch2);
            
            if(flag){
                return true;
            }else{
                left++;
                window++;
            }
        }
        return false;
    }
}
