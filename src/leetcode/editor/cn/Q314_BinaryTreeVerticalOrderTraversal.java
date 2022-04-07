//给你一个二叉树的根结点，返回其结点按 垂直方向（从上到下，逐列）遍历的结果。 
//
// 如果两个结点在同一行和列，那么顺序则为 从左到右。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：[[9],[3,15],[20],[7]]
// 
//
// 示例 2： 
//
// 
//输入：root = [3,9,8,4,0,1,7]
//输出：[[4],[9],[3,0,1],[8],[7]]
// 
//
// 示例 3： 
//
// 
//输入：root = [3,9,8,4,0,1,7,null,null,null,2,5]
//输出：[[4],[9,5],[3,0,1],[8,2],[7]]
// 
//
// 
//
// 提示： 
//
// 
// 树中结点的数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
// Related Topics 树 深度优先搜索 广度优先搜索 哈希表 二叉树 👍 163 👎 0

package leetcode.editor.cn;

import java.util.List;

public class Q314_BinaryTreeVerticalOrderTraversal{
    public static void main(String[] args) {
        Q314_BinaryTreeVerticalOrderTraversal tmp = new Q314_BinaryTreeVerticalOrderTraversal();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

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
class Solution {
    public List<List<Integer>> verticalOrder(TreeNode root) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}