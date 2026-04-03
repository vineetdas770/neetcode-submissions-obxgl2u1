class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int target = nums.length/3;
        List<Integer> list = new ArrayList<>();

        Map<Integer, Long> map = Arrays.stream(nums)
        .mapToObj(e -> e)
        .collect(Collectors.groupingBy(
                x->x, Collectors.counting()));

        List<Map.Entry<Integer, Long>> op = map.entrySet().stream()
                .filter(a -> a.getValue() > target)
                .collect(Collectors.toList());

        for(Map.Entry<Integer,Long> m : op){
            list.add((Integer) m.getKey());
        }

        return list;
    }
}