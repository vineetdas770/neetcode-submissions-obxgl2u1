class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        int[] result = list.stream()
        .map(Map.Entry::getKey).limit(k).mapToInt(Integer::intValue).toArray();

        return result;

    }
}
