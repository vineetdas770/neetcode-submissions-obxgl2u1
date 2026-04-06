class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        int j = i;
        while (i < str.length()) {
            if (str.charAt(j) != '#') {
                j++;
            }else{
                int length = Integer.parseInt(str.substring(i,j));
                j++;
                i = j +length;
                list.add(str.substring(j,i));
                j=i;
            }

        }
        return list;
    }
}
