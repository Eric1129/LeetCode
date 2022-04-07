//给定一个字符串，判断该字符串中是否可以通过重新排列组合，形成一个回文字符串。 
//
// 示例 1： 
//
// 输入: "code"
//输出: false 
//
// 示例 2： 
//
// 输入: "aab"
//输出: true 
//
// 示例 3： 
//
// 输入: "carerac"
//输出: true 
// Related Topics 位运算 哈希表 字符串 👍 59 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class Q266_PalindromePermutation{
    public static void main(String[] args) {
        Q266_PalindromePermutation tmp = new Q266_PalindromePermutation();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPermutePalindrome(String s) {
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int oddNumebr = 0;
        for (char c : map.keySet()) {
            if (map.get(c) % 2 != 0) {
                oddNumebr++;
            }
            if (oddNumebr > 1) return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}