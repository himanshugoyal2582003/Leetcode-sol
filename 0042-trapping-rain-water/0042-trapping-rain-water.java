class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;

        int ml =0;
        int mr=0;
  
        int water =0;
        while(l<r){
            if(height[l]<=height[r]){
                if(height[l]>=ml){
                    ml=height[l];
                }else{
                    water += ml-height[l];
                }
                l++;
            }else{
                if(height[r]>=mr){
                    mr=height[r];
                }else{
                    water += mr-height[r];
                }
                r--;
            }
        }
        return water;
    }
} 