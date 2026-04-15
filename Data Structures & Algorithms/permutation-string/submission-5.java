class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[] s1_freq = new int[26];
        int[] s2_freq = new int[26];

        if(m>n){
            return false;
        }

        for(char c : s1.toCharArray()){
            s1_freq[c-'a']++;
        }

        int i =0;
        int j =0;
        while(j<n){

            s2_freq[s2.charAt(j) -'a']++;

            if(j-i+1>m){
                s2_freq[s2.charAt(i) -'a']--;
                i++;
            }

            if(Arrays.equals(s1_freq,s2_freq)){
                return true;
            }
            j++;
        }
        return false;
    }
}
