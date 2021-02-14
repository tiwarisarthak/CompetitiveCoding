class Solution {
   public int lengthOfLongestSubstring(String s) {
        int answer=0;
		for(int i=0;i<s.length();++i) {
        	for(int j=i;j<s.length();++j) {
        		//check if substring i to j is unique characters
        		List<Character> charList = new ArrayList<Character>();
        		boolean isUnique = true;
        		for(int k=i;k<=j;++k) {
        			if(charList.contains(s.charAt(k))) {
        				isUnique = false;
        				break;
        			}else {
        				charList.add(s.charAt(k));
        			}
        		}
        		if(isUnique) {
        			if(j-i +1 > answer) {
        				answer = j-i+1;
        			}
        		}
        		
        		
        	}
        }
		
		return answer;
    }
}