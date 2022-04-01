//给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。 
//
// 
//
// 示例 1: 
//
// 
//
// 
//输入: [1,2,3,null,5,null,4]
//输出: [1,3,4]
// 
//
// 示例 2: 
//
// 
//输入: [1,null,3]
//输出: [1,3]
// 
//
// 示例 3: 
//
// 
//输入: []
//输出: []
// 
//
// 
//
// 提示: 
//
// 
// 二叉树的节点个数的范围是 [0,100] 
// -100 <= Node.val <= 100 
// 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 653 👎 0

package leetcode.editor.cn;

import java.util.*;

public class Q199_BinaryTreeRightSideView{
    public static void main(String[] args) {
        Q199_BinaryTreeRightSideView tmp = new Q199_BinaryTreeRightSideView();
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

    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer, Integer> rightValueAtDepth = new HashMap<>();
        int maxDepth = -1;

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> depthQueue = new LinkedList<>();
        queue.add(root);
        depthQueue.add(0);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            int depth = depthQueue.poll();

            if (node != null) {
                maxDepth = Math.max(maxDepth, depth);

                rightValueAtDepth.put(depth, node.val);

                queue.add(node.left);
                queue.add(node.right);
                depthQueue.add(depth+1);
                depthQueue.add(depth+1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int depth = 0; depth <= maxDepth; depth++) {
            list.add(rightValueAtDepth.get(depth));
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
