class Solution {
    public int minCapability(int[] nums, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int x: nums){
            low = Math.min(low,x);
            high= Math.max(high,x);
        }

        while(low < high){
            int mid = low + (high-low)/2;

            if(canRob(nums,k,mid)){
                high=mid;
            }else{
                low = mid+1;
            }
        }

        return low;
    }

    public boolean canRob(int[] nums , int k , int cap){
        int count =0 ;

        for(int i =0 ; i< nums.length ; i++){
            if(nums[i]<=cap){
                count++;
                i++;
            }

            if(count>=k){
                return true;
            }

           
        }
         return false;
    }
}