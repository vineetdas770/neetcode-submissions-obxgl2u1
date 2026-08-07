class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,ArrayList<String>> map = new HashMap<>(); 
        
        for(String s : strs){
             
            int[] ch = new int[26];
            for(Character c : s.toCharArray()){
                ch[c-'a']++;
            }
            String key = Arrays.toString(ch);
            
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        List<List<String>> list = new ArrayList<>(map.values());
        return list;
    }
}
