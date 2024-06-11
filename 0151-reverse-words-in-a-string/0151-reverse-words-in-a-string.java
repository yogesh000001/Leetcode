class Solution {
    public String reverseWords(String s) {
        int i = s.length()-1;
        StringBuilder str = new StringBuilder();
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;
            int j = i;
            if(i<0) break;
            while(i>=0 && s.charAt(i)!=' ') i--;
            if(str.isEmpty()){
                str = str.append(s.substring(i+1,j+1));
            }else{
                str = str.append(" "+s.substring(i+1,j+1));
            }
        }
        return str.toString();
    }
}