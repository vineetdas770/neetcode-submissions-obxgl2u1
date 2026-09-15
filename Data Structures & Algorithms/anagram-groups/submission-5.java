class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] ch = new int[26];
            for(char c : s.toCharArray()){
                ch[c-'a']++;
            }
            String key = Arrays.toString(ch);

            if(!map.containsKey(key)){
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }else{
                map.get(key).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
}
