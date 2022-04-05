//给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。 
//
// 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在 32 位 整数范围内。 
//
// 请不要使用除法，且在 O(n) 时间复杂度内完成此题。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,2,3,4]
//输出: [24,12,8,6]
// 
//
// 示例 2: 
//
// 
//输入: nums = [-1,1,0,-3,3]
//输出: [0,0,9,0,0]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 10⁵ 
// -30 <= nums[i] <= 30 
// 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在 32 位 整数范围内 
// 
//
// 
//
// 进阶：你可以在 O(1) 的额外空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。） 
// Related Topics 数组 前缀和 👍 1115 👎 0

package leetcode.editor.cn;
public class Q238_ProductOfArrayExceptSelf{
    public static void main(String[] args) {
        Q238_ProductOfArrayExceptSelf tmp = new Q238_ProductOfArrayExceptSelf();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] L = new int[n];
        int[] R = new int[n];
        int[] ans = new int[n];

        L[0] = 1;
        for (int i = 1; i<nums.length; i++) {
            L[i] = nums[i-1] * L[i-1];
        }
        R[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            R[i] = nums[i+1] * R[i+1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = L[i] * R[i];
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
