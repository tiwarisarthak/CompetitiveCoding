class Solution {
    public boolean isValid(String s) {
     try {
        char[] allChars = s.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < allChars.length; ++i) {
            if (allChars[i] == '(' || allChars[i] == '{' || allChars[i] == '[') {
                stack.push(allChars[i]);
            } else {
                char currChar = (char) stack.pop();
                if(currChar == '('){
                    if(!(allChars[i] == ')')){
                        return false;
                    }
                }

                if(currChar == '{'){
                    if(!(allChars[i] == '}')){
                        return false;
                    }
                }

                if(currChar == '['){
                    if(!(allChars[i] == ']')){
                        return false;
                    }
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }catch(Exception e){
        return false;
    }
    }
}