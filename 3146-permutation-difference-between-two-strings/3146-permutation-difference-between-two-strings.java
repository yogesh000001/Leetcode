class Solution {
    public int findPermutationDifference(String s, String t) {
        int gap = 0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i) == t.charAt(j)){
                    gap += Math.abs(i-j);
                }
            }
        }
        return gap;
    }
}