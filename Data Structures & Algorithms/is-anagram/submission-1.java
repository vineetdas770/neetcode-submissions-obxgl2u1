class Solution {
    public boolean isAnagram(String s, String t) {

        char[] ch1 = new char[26];
        
        for (char c : s.toCharArray()){
            ch1[c - 'a']++;
        }

        for (char c : t.toCharArray()){
            ch1[c - 'a']--;
        }

        for(int i : ch1){
            if(i!=0){
                return false;
            }
        }

    return true;

    }
}
