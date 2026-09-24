class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int l =0;
        int r = plants.length-1;

        int wA=capacityA;
        int wB=capacityB;

        int refil =0;

        while(l<r){
            if(wA<plants[l]){
                refil++;
                wA=capacityA;
            }
            wA-=plants[l];
            l++;

            if(wB<plants[r]){
                refil++;
                wB=capacityB;
            }
            wB-=plants[r];
            r--;


            

        }
        if(l==r){
                if(Math.max(wA,wB)<plants[l]){
                    refil++;
                }
            }

        return refil;    
    }
}