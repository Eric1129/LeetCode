//给定一个非负整数，你至多可以交换一次数字中的任意两位。返回你能得到的最大值。 
//
// 示例 1 : 
//
// 
//输入: 2736
//输出: 7236
//解释: 交换数字2和数字7。
// 
//
// 示例 2 : 
//
// 
//输入: 9973
//输出: 9973
//解释: 不需要交换。
// 
//
// 注意: 
//
// 
// 给定数字的范围是 [0, 10⁸] 
// 
// Related Topics 贪心 数学 👍 232 👎 0

package leetcode.editor.cn;
public class Q670_MaximumSwap{
    public static void main(String[] args) {
        Q670_MaximumSwap tmp = new Q670_MaximumSwap();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumSwap(int num) {
        StringBuilder s = new StringBuilder(String.valueOf(num));
        int[] last = new int[10];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - '0'] = i;
        }
        for (int left = 0; left < s.length()-1; left++) {
            for (int right = 9; right > s.charAt(left) - '0'; right--) {
                if (last[right] > left) {
                    char c = s.charAt(left);
                    s.setCharAt(left, s.charAt(last[right]));
                    s.setCharAt(last[right],c);
                    return Integer.parseInt(s.toString());
                }
            }
        }
        return num;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}