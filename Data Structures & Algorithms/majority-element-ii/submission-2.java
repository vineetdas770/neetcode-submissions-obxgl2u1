class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int target = nums.length/3;
        List<Integer> output = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int n : nums){
                map.put(n,map.getOrDefault(n,0)+1);
        }

        for(int a : map.keySet()){
            if(map.get(a)>target){
                output.add(a);
            }
        }

        return output;
    }
}