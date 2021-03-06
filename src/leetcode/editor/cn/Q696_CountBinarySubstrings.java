//给定一个字符串 s，计算具有相同数量 0 和 1 的非空（连续）子字符串的数量，并且这些子字符串中的所有 0 和所有 1 都是连续的。 
//
// 重复出现的子串要计算它们出现的次数。 
//
// 
//
// 示例 1 : 
//
// 
//输入: "00110011"
//输出: 6
//解释: 有6个子串具有相同数量的连续1和0：“0011”，“01”，“1100”，“10”，“0011” 和 “01”。
//
//请注意，一些重复出现的子串要计算它们出现的次数。
//
//另外，“00110011”不是有效的子串，因为所有的0（和1）没有组合在一起。
// 
//
// 示例 2 : 
//
// 
//输入: "10101"
//输出: 4
//解释: 有4个子串：“10”，“01”，“10”，“01”，它们具有相同数量的连续1和0。
// 
//
// 
//
// 提示： 
//
// 
// s.length 在1到50,000之间。 
// s 只包含“0”或“1”字符。 
// 
// Related Topics 双指针 字符串 👍 418 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class Q696_CountBinarySubstrings{
    public static void main(String[] args) {
        Q696_CountBinarySubstrings tmp = new Q696_CountBinarySubstrings();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countBinarySubstrings(String s) {
//        int n = s.length();
//        List<Integer> list = new ArrayList<>();
//        int sum = 1;
//        for (int i = 1; i < n; i++) {
//            if (s.charAt(i) == s.charAt(i-1)) {
//                sum++;
//            } else {
//                list.add(sum);
//                sum=1;
//            }
//        }
//        list.add(sum);
//        int ans = 0;
//        for (int i = 0; i < list.size()-1; i++) {
//            ans += Math.min(list.get(i), list.get(i+1));
//        }
//        return ans;
        int ptr = 0, n = s.length(), last = 0, ans = 0;
        while (ptr < n) {
            char c = s.charAt(ptr);
            int count = 0;
            while (ptr < n && s.charAt(ptr) == c) {
                ++ptr;
                ++count;
            }
            ans += Math.min(count, last);
            last = count;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
