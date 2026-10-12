class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] even = new int[nums.length/2]; 
        int[] odd = new int[nums.length/2];
        int Y= 0 ;int y =0;
        for(int i =0 ; i < nums.length ; i++ ){
            if(nums[i]%2==0){even[y++]=nums[i];}else{odd[Y++]=nums[i];}
        }
        y=0;
        for(int i =0 ; i< nums.length/2 ; i++){
            nums[y++]=even[i];
            nums[y++]=odd[i];
        }
        return nums;
    }
}