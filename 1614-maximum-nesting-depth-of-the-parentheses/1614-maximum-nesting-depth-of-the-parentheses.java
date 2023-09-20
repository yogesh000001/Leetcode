class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int maxDepth = 0;
        int currDepth = 0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                st.push(ch);
                currDepth = st.size();
                maxDepth = Math.max(currDepth,maxDepth);
            }else if(ch == ')'){
                st.pop();
            }
        }
        return maxDepth;
    }
}