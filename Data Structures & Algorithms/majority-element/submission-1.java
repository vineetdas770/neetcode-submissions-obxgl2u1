class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = 0;
        int target = nums.length/2;

        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int n : nums){
            freqMap.put(n, freqMap.getOrDefault(n, 0)+1);
        }

 
        for(Map.Entry<Integer,Integer> m : freqMap.entrySet()){
            if(m.getValue()>target){
                majorityElement = m.getKey();
            }
        }
        return majorityElement;
    }
}