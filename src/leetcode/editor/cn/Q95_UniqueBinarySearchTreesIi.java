//给你一个整数 n ，请你生成并返回所有由 n 个节点组成且节点值从 1 到 n 互不相同的不同 二叉搜索树 。可以按 任意顺序 返回答案。 
//
// 
//
// 
// 
// 示例 1： 
//
// 
//输入：n = 3
//输出：[[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 8 
// 
// 
// 
// Related Topics 树 二叉搜索树 动态规划 回溯 二叉树 👍 1004 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q95_UniqueBinarySearchTreesIi{
    public static void main(String[] args) {
        Q95_UniqueBinarySearchTreesIi tmp = new Q95_UniqueBinarySearchTreesIi();
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
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new LinkedList<>();
        return build(1,n);
    }

    public List<TreeNode> build(int lo, int hi){
        List<TreeNode> ans = new ArrayList<>();
        if(lo > hi) {
            ans.add(null);
            return ans;
        }

        for (int i = lo; i<=hi; i++){
            List<TreeNode> leftTree = build(lo, i-1);
            List<TreeNode> rightTree = build(i+1, hi);

            for (TreeNode left: leftTree){
                for(TreeNode right: rightTree){
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
