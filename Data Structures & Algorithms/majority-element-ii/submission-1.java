class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int target = nums.length/3;
        List<Integer> output = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int n : nums){
            if(!map.containsKey(n)){
                map.put(n,map.getOrDefault(n,0)+1);
            }else {
                map.put(n, map.get(n) + 1);
            }
        }
        System.out.println(map);

        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()>target){
                output.add(m.getKey());
            }
        }

        return output;
    }
}