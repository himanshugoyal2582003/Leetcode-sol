class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        if(root.left == null && root.right ==null ){
            return false;
        }
        inorder(root, ans);
        for(int i =0 ; i<ans.size();i++){
            for(int j =i+1 ; j < ans.size();j++){
                if(ans.get(i)+ans.get(j)==k){return true;}
            }
        }
        return false;
    }
     public void inorder(TreeNode root, List<Integer> ans) {
        if (root == null) return;
        inorder(root.left, ans);  
        ans.add(root.val);        
        inorder(root.right, ans); 
    }
}
