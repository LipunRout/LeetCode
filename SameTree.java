class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // case 1: both are null
        if (p == null && q == null) return true;
        
        // case 2: one is null, other not
        if (p == null || q == null) return false;
        
        // case 3: values are different
        if (p.val != q.val) return false;
        
        // case 4: check left & right subtree
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
