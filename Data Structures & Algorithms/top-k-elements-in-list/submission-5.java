class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] res = new int[k];
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int n : nums){
            freqMap.put(n,freqMap.getOrDefault(n,0)+1);
        }

        List<Integer>[] bucket = new List[nums.length +1];

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            int freq = entry.getValue();
            if(bucket[freq] == null){
                List<Integer> list = new ArrayList<>();
                list.add(entry.getKey());
                bucket[freq] = list;
            }else{
                bucket[freq].add(entry.getKey());
            }
        }

        int index=0;
        for(int i = bucket.length -1 ; i>=0 && index<k ;i--){
            if(bucket[i]!=null){
                for(Integer num : bucket[i]){
                    res[index]= num;
                    index++;
                }
            }
        }
        return res;
    }
}
