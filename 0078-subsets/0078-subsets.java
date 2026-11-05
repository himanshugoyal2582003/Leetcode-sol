class Solution {
    static void sub(int index ,int[] arr,List<List<Integer>> ans , ArrayList<Integer> curr ){
        
        if(index>=arr.length){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        
        curr.add(arr[index]);
        sub(index+1,arr,ans,curr);

        curr.remove(curr.size()-1);

        sub(index+1,arr,ans,curr);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        sub(0,nums,ans, new ArrayList<>());
        
        return ans;
    }
}