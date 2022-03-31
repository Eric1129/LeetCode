//给你一棵指定的二叉树的根节点 root ，请你计算其中 最长连续序列路径 的长度。 
//
// 最长连续序列路径 是依次递增 1 的路径。该路径，可以是从某个初始节点到树中任意节点，通过「父 - 子」关系连接而产生的任意路径。且必须从父节点到子节点，
//反过来是不可以的。 
// 
//
// 示例 1： 
//
// 
//输入：root = [1,null,3,2,4,null,null,null,5]
//输出：3
//解释：当中，最长连续序列是 3-4-5 ，所以返回结果为 3 。
// 
//
// 示例 2： 
//
// 
//输入：root = [2,null,3,2,null,1]
//输出：2
//解释：当中，最长连续序列是 2-3 。注意，不是 3-2-1，所以返回 2 。
// 
//
// 
//
// 提示： 
//
// 
// 树中节点的数目在范围 [1, 3 * 10⁴] 内 
// -3 * 10⁴ <= Node.val <= 3 * 10⁴ 
// 
// Related Topics 树 深度优先搜索 二叉树 👍 86 👎 0

package leetcode.editor.cn;
public class Q298_BinaryTreeLongestConsecutiveSequence{
    public static void main(String[] args) {
        Q298_BinaryTreeLongestConsecutiveSequence tmp = new Q298_BinaryTreeLongestConsecutiveSequence();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int longestConsecutive(TreeNode root) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
