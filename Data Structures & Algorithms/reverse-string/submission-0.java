class Solution {
    public void reverseString(char[] s) {
        int size = s.length;
        int i=0;
        int j = s.length -1;
        while (i<=j){
            char a = s[i];
            char b = s[j];
            s[i] = b;
            s[j] = a;
            i++;
            j--;
        }
    }
}