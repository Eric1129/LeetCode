//给定一棵二叉树，返回所有重复的子树。对于同一类的重复子树，你只需要返回其中任意一棵的根结点即可。 
//
// 两棵树重复是指它们具有相同的结构以及相同的结点值。 
//
// 示例 1： 
//
//         1
//       / \
//      2   3
//     /   / \
//    4   2   4
//       /
//      4
// 
//
// 下面是两个重复的子树： 
//
//       2
//     /
//    4
// 
//
// 和 
//
//     4
// 
//
// 因此，你需要以列表的形式返回上述重复子树的根结点。 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 313 👎 0

package leetcode.editor.cn;

import java.util.List;

public class Q652_FindDuplicateSubtrees{
    public static void main(String[] args) {
        Q652_FindDuplicateSubtrees tmp = new Q652_FindDuplicateSubtrees();
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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
