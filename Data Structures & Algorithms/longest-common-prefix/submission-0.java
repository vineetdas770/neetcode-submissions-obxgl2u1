class Solution {
    public String longestCommonPrefix(String[] strs) {
        String x =  Arrays.stream(strs).reduce((a,b)->{
            int i=0;
            while(i < a.length() && i< b.length() && a.charAt(i)==b.charAt(i)){
                i++;
            }
            return a.substring(0,i);
        }).orElse("");

        return x;
    }
}