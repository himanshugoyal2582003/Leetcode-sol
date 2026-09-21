class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int l= 0;
        int r= nums.length-1;
        long c=0;
        int MOD = 1_000_000_007;
    
        int[] pow = new int[r+1];
        pow[0]=1;
        for(int i=1 ; i<r+1 ;i++){
            pow[i]=(pow[i-1]*2)%MOD;
        }



        while(l<=r){
           if(nums[l]+nums[r]<=target){
              c+=pow[r-l];
              c%=MOD;
              l++;
           }else{
             r--;
           }
        }

        return (int) c;
    }
}