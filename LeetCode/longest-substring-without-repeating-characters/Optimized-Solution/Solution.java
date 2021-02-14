class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int len = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                len = Math.min(len+1, i - map.get(ch));
                map.put(ch, i);
            } else {
                map.put(ch, i);
                len++;
            }
            if(max < len) {
                max = len;
            }
        }
        if(max == Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }
}