//给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的
//根节点的引用。 
//
// 一般来说，删除节点可分为两个步骤： 
//
// 
// 首先找到需要删除的节点； 
// 如果找到了，删除它。 
// 
//
// 说明： 要求算法时间复杂度为 O(h)，h 为树的高度。 
//
// 示例: 
//
// 
//root = [5,3,6,2,4,null,7]
//key = 3
//
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//给定需要删除的节点值是 3，所以我们首先找到 3 这个节点，然后删除它。
//
//一个正确的答案是 [5,4,6,2,null,null,7], 如下图所示。
//
//    5
//   / \
//  4   6
// /     \
//2       7
//
//另一个正确答案是 [5,2,6,null,4,null,7]。
//
//    5
//   / \
//  2   6
//   \   \
//    4   7
// 
// Related Topics 树 二叉搜索树 二叉树 👍 545 👎 0

package leetcode.editor.cn;
public class Q450_DeleteNodeInABst{
    public static void main(String[] args) {
        Q450_DeleteNodeInABst tmp = new Q450_DeleteNodeInABst();
        Solution solution = tmp.new Solution();
    }

     // Definition for a binary tree node.
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key){
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            // 如果左右都有node
            TreeNode minNode = getMinNode(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, minNode.val);
        } else if (root.val < key){
            root.right = deleteNode(root.right, key);
        } else if (root.val > key){
            root.left = deleteNode(root.left, key);
        }
        return root;
    }
    public TreeNode getMinNode(TreeNode node){
        // 最左边的node是最小的
        while (node.left != null) node = node.left;
        return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
