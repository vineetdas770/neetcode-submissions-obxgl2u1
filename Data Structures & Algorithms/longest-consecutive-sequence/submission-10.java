class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
       for(int n : nums){
           set.add(n);
       }
       
       int longest = 0;
       
       for(int n : nums){
        if(!set.contains(n-1)){
           int current = n;
           int streak = 0;
           while(set.contains(current)){
               streak++;
               current++;
           }
           longest = Math.max(longest,streak);
       }
       }
       return longest;
    }
}
