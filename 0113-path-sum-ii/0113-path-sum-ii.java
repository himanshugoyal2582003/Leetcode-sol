class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        solver(root, targetSum, path, ans);

        return ans;
    }

    public void solver(TreeNode root, int targetSum,  List<Integer> path,  List<List<Integer>> ans) {

        if (root == null) return;

    
        path.add(root.val);

       
        if (root.left == null && root.right == null && targetSum == root.val) {
            ans.add(new ArrayList<>(path));
        }

       
        solver(root.left, targetSum - root.val, path, ans);
        solver(root.right, targetSum - root.val, path, ans);

     
        path.remove(path.size() - 1);
    }
}