class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r = height.length -1;
        int max = 0;
        while(l<r){
           int b = r-l;
           int h = Math.min(height[l],height[r]);

           if(max< h*b){max=h*b;}

           if(height[l]<height[r]){
             l++;
           }else{
             r--;
           }
        }
        return max;
    }
}