class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr1 = new int[nums.length/2];
        int[] arr2 = new int[nums.length/2];
        int y =0 ;
        for(int i =0 ; i< nums.length ; i++){
            if(nums[i]<0){arr1[y++]=nums[i];}
        }
         y =0 ;
        for(int i =0 ; i< nums.length ; i++){
            if(nums[i]>=0){arr2[y++]=nums[i];}
        }
         y =0 ;
        for(int i =0 ; i < arr1.length; i++){
            nums[y++] = arr2[i];
            nums[y++] = arr1[i];
        }
        return nums;
    }
}