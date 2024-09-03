class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                if(count>0){
                    sb.append('(');
                }
                count++;
            }else{
                count--;
                if(count>0){
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
}