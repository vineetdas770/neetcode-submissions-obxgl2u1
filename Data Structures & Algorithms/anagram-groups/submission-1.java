class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> list = Arrays.asList(strs);

        List<List<String>> a = list.stream().collect(Collectors
                .groupingBy(e -> Arrays.stream(e.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.toList())
                ))
                .values().stream().collect(Collectors.toList());
        
        return a;
    }
}
