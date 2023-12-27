class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int prevSum = 0;
        for(int i=0;i<nums.length;i++){
            prevSum += nums[i];
            sum = Math.max(prevSum,sum);
            if(prevSum<0){
                prevSum = 0;
            }
        }
        return sum;
    }
}