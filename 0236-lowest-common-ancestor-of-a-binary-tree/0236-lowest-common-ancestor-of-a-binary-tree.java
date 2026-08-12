class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p || root==q || root==null){ return root;}
        TreeNode L = lowestCommonAncestor(root.left , p,q);
        TreeNode R = lowestCommonAncestor(root.right, p,q);

        if(L != null && R !=null){ return root;}
        else if(L!= null){return L;}
        else if(R!= null){return R;}
        else{ return null; }
    }
}