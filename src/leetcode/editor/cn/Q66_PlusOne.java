//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = [1,2,3]
//输出：[1,2,4]
//解释：输入数组表示数字 123。
// 
//
// 示例 2： 
//
// 
//输入：digits = [4,3,2,1]
//输出：[4,3,2,2]
//解释：输入数组表示数字 4321。
// 
//
// 示例 3： 
//
// 
//输入：digits = [0]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// 
// Related Topics 数组 数学 👍 979 👎 0

package leetcode.editor.cn;
public class Q66_PlusOne{
    public static void main(String[] args) {
        Q66_PlusOne tmp = new Q66_PlusOne();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        int i = 0;
        while (n-i-1 >= 0 && carry == 1) {
            digits[n-i-1] += 1;
            carry = digits[n-i-1]/10;
            digits[n-i-1] %= 10;
            i++;
        }
        int[] ans;
        if (carry == 1) {
            ans = new int[n+1];
            ans[0] = 1;
            for (int j = 1; i < ans.length; i++) {
                ans[j] = digits[j-1];
            }
        } else {
            ans = digits;
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}