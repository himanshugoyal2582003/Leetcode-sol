class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] used = new boolean[nums2.length];

        for(int i =0 ; i<nums1.length ; i++){
            for(int j =0 ; j<nums2.length ; j++){
                
                if(!used[j] && nums1[i]==nums2[j]){
                    arr.add(nums1[i]);
                    used[j]= true ;
                    break;
                }

            }
        }
        int[] arr1 = new int[arr.size()]; 
        int y=0;
        for(Integer i : arr){
            arr1[y++]=i;
        }
        return arr1;
    }
}