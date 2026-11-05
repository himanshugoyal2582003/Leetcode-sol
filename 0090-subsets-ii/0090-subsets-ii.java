class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        sub(0,nums,ans, new ArrayList<>());
        
        return ans;
    }
     static void sub(int index ,int[] arr,List<List<Integer>> ans , ArrayList<Integer> curr ){
        
        if(index>=arr.length){
            if (!ans.contains(curr)) {
        ans.add(new ArrayList<>(curr));
    }
            return ;
        }
        
        curr.add(arr[index]);
        sub(index+1,arr,ans,curr);

        curr.remove(curr.size()-1);

        sub(index+1,arr,ans,curr);

    }
}
