class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;

        int[] ans = new int[nums.length];
        int i = nums.length-1;

        while(l<=r){
            int left =nums[l]*nums[l];
            int right =nums[r]*nums[r];
            

            if(left>right){
               ans[i]=left;
               l++;
            }else{
                ans[i]=right;
                r--;
            }

            i--;
        }
        
        return ans;
    }
}