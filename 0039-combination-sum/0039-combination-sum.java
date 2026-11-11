import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();

        find(0, candidates, target, ds, ans);

        return ans;
    }

    void find(int ind, int[] arr, int target,ArrayList<Integer> ds,List<List<Integer>> ans) {

        
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

    
        if (arr[ind] <= target) {

            ds.add(arr[ind]);

            find(ind, arr, target - arr[ind], ds, ans);

           
            ds.remove(ds.size() - 1);
        }

       
        find(ind + 1, arr, target, ds, ans);
    }
}
