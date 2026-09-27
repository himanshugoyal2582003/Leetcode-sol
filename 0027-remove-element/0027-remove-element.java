class Solution {
    public int removeElement(int[] nums, int val) {
        int y=0;
        for(int i =0 ; i<nums.length ; i++){
            if(val != nums[i]){nums[y++]=nums[i];}
        }
        return y;
    }
}