class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Long> op = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));
        

        int[] res = op.entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue()
                        .reversed()).limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue).toArray();

                return res;

    }
}
