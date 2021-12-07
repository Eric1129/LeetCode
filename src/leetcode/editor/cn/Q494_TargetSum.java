//给你一个整数数组 nums 和一个整数 target 。 
//
// 向数组中的每个整数前添加 '+' 或 '-' ，然后串联起所有整数，可以构造一个 表达式 ： 
//
// 
// 例如，nums = [2, 1] ，可以在 2 之前添加 '+' ，在 1 之前添加 '-' ，然后串联起来得到表达式 "+2-1" 。 
// 
//
// 返回可以通过上述方法构造的、运算结果等于 target 的不同 表达式 的数目。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,1,1,1], target = 3
//输出：5
//解释：一共有 5 种方法让最终目标和为 3 。
//-1 + 1 + 1 + 1 + 1 = 3
//+1 - 1 + 1 + 1 + 1 = 3
//+1 + 1 - 1 + 1 + 1 = 3
//+1 + 1 + 1 - 1 + 1 = 3
//+1 + 1 + 1 + 1 - 1 = 3
// 
//
// 示例 2： 
//
// 
//输入：nums = [1], target = 1
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 20 
// 0 <= nums[i] <= 1000 
// 0 <= sum(nums[i]) <= 1000 
// -1000 <= target <= 1000 
// 
// Related Topics 数组 动态规划 回溯 👍 965 👎 0

package leetcode.editor.cn;
public class Q494_TargetSum{
    public static void main(String[] args) {
        Q494_TargetSum tmp = new Q494_TargetSum();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // 回溯
//    int result = 0;
    public int findTargetSumWays(int[] nums, int target) {
//        if (nums.length == 0) return 0;
//        backtrack(nums, 0, target);
//        return result;
        int sum = 0;
        for (int n : nums) sum += n;
        // 以下两种情况不可能存在合法的子集划分
        if ( sum < Math.abs(target) || (sum + target) % 2 == 1) return 0;
        return subsets(nums, (sum+target)/2);
    }

    int subsets(int[] nums, int sum) {
        int n = nums.length;
        int[] dp = new int[sum+1];
        // base case
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = sum; j >= 0; j--) {
                if ( j >= nums[i-1]) {
                    dp[j] = dp[j] + dp[j-nums[i-1]];
                }
            }
        }
        return dp[sum];
    }

//    /* 回溯算法模板 */
//    void backtrack(int[] nums, int i, int rest) {
//        // base case
//        if (i == nums.length) {
//            if (rest == 0) {
//                // 说明恰好凑出 target
//                result++;
//            }
//            return;
//        }
//        // 给 nums[i] 选择 - 号
//        rest += nums[i];
//        // 穷举 nums[i + 1]
//        backtrack(nums, i + 1, rest);
//        // 撤销选择
//        rest -= nums[i];
//        // 给 nums[i] 选择 + 号
//        rest -= nums[i];
//        // 穷举 nums[i + 1]
//        backtrack(nums, i + 1, rest);
//        // 撤销选择
//        rest += nums[i];
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
