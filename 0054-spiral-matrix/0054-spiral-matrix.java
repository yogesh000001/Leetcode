class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> res = new ArrayList<>();
        int minr = 0;
        int maxr = arr.length-1;
        int minc = 0;
        int maxc = arr[0].length-1;
        int total = arr.length * arr[0].length;
        int count = 0;
        while(count < total){
            for (int i=minc;i<=maxc && count<total;i++){
                res.add(arr[minr][i]);
                count++;
            }
            minr++;
            for (int i=minr;i<=maxr && count<total;i++){
                res.add(arr[i][maxc]);
                count++;
            }
            maxc--;
            for (int i=maxc;i>=minc && count<total;i--){
                res.add(arr[maxr][i]);
                count++;
            }
            maxr--;
            for (int i=maxr;i>=minr && count<total;i--){
                res.add(arr[i][minc]);
                count++;
            }
            minc++;
        }
        return res;
    }
}