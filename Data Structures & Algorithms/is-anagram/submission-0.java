class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for(char c1 : s.toCharArray()){
            count[Character.toUpperCase(c1) - 'A'] += 1;
        }
        for(char c2 : t.toCharArray()){
            count[Character.toUpperCase(c2) - 'A'] -= 1;
        }

        for(int cnt : count){
            if(cnt != 0){
                return false;
            }
        }

        return true;
    }
}
