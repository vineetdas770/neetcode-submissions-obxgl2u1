class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int longest=0;
        for(int n : nums){
            set.add(n);
        }
        
        for (int n : nums){
            if(!set.contains(n-1)){
                int streak = 0; 
                int current = n;
                while(set.contains(current)){
                    current++;
                    streak++;
                }
                longest = Math.max(longest,streak);
            }
        }
        return longest;
    }
}
