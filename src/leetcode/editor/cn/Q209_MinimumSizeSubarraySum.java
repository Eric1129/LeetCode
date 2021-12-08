//给定一个含有 n 个正整数的数组和一个正整数 target 。 
//
// 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长
//度。如果不存在符合条件的子数组，返回 0 。 
//
// 
//
// 示例 1： 
//
// 
//输入：target = 7, nums = [2,3,1,2,4,3]
//输出：2
//解释：子数组 [4,3] 是该条件下的长度最小的子数组。
// 
//
// 示例 2： 
//
// 
//输入：target = 4, nums = [1,4,4]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：target = 11, nums = [1,1,1,1,1,1,1,1]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= target <= 10⁹ 
// 1 <= nums.length <= 10⁵ 
// 1 <= nums[i] <= 10⁵ 
// 
//
// 
//
// 进阶： 
//
// 
// 如果你已经实现 O(n) 时间复杂度的解法, 请尝试设计一个 O(n log(n)) 时间复杂度的解法。 
// 
// Related Topics 数组 二分查找 前缀和 滑动窗口 👍 843 👎 0

package leetcode.editor.cn;
public class Q209_MinimumSizeSubarraySum{
    public static void main(String[] args) {
        Q209_MinimumSizeSubarraySum tmp = new Q209_MinimumSizeSubarraySum();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0, r = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        while (r < n) {
            sum += nums[r];
            while (sum >= target) {
                int length = r - l + 1;
                minLength = Math.min(minLength, length);
                sum -= nums[l];
                l++;
            }
            r++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
