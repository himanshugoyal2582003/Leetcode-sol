
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> ls = new ArrayList<>();
        if(root==null){ return false;}
        int sum = targetSum;
        int p =0;
        solver(root,ls,p);
        return ls.contains(sum);
    }

    public void solver(TreeNode root , List<Integer> ls, int path ){
        if(root == null) return ;

        path+=root.val;
        if(root.left == null && root.right == null){
            ls.add(path);
            return ;
        }

      

        solver(root.left,ls, path);
        solver(root.right,ls, path);
    }
}


