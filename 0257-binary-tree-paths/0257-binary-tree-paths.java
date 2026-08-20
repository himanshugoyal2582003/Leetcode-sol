class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ls = new ArrayList<>();
        if(root==null){ return ls;}

        solver(root,"",ls);
        return ls;
    }

    public void solver(TreeNode root , String path , List<String> ls){
        if(root == null) return ;

        path+=root.val;
        if(root.left == null && root.right == null){
            ls.add(path);
            return ;
        }

        path+="->";

        solver(root.left, path,ls);
        solver(root.right, path,ls);
    }
}