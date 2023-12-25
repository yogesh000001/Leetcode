class Solution {
    public int trap(int[] height) {
        int n = height.length;
        //calculate left max boundary
        int leftMax [] = new int[n];
        leftMax[0] = height[0];
        for (int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //calculate right max boundary
        int rightMax [] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        int trapWater = 0;
        //loop
        for (int i=0;i<n;i++){
            //waterLevel = min(leftMax bound, rightMax bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trapped water = waterLevel - height
            trapWater += waterLevel - height[i];
        }
        return trapWater;
    }
}