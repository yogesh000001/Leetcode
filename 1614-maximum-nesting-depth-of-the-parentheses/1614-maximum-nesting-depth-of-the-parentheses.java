class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int depth = 0;
        int maxdepth = 0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                st.push(ch);
                depth = st.size();
                maxdepth = Math.max(depth,maxdepth);
            }else if(ch == ')'){
                st.pop();
            }
        }
        return maxdepth;
    }
}