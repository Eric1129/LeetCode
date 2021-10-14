//给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？返回满足题意的二叉搜索树的种数。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：5
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 19 
// 
// Related Topics 树 二叉搜索树 数学 动态规划 二叉树 👍 1362 👎 0

package leetcode.editor.cn;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Q96_UniqueBinarySearchTrees{
    public static void main(String[] args) {
        Q96_UniqueBinarySearchTrees tmp = new Q96_UniqueBinarySearchTrees();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numTrees(int n) {
        // 时间复杂度 O(N^2)
        // 空间复杂度 O(N)
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i<=n; i++){
            for(int j = 0; j < i; j++){
                dp[i] += dp[i-j-1]*dp[j];
            }
        }
        return dp[n];

        // Method2 数学
        // 通过推到 method1 来得到此数学表达式
//        long C = 1;
//        for (int i = 0; i < n; ++i) {
//            C = C * 2 * (2 * i + 1) / (i + 2);
//        }
//        return (int) C;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
