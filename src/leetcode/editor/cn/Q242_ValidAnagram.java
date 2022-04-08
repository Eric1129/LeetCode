//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "rat", t = "car"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length, t.length <= 5 * 10⁴ 
// s 和 t 仅包含小写字母 
// 
//
// 
//
// 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 哈希表 字符串 排序 👍 549 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class Q242_ValidAnagram{
    public static void main(String[] args) {
        Q242_ValidAnagram tmp = new Q242_ValidAnagram();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        if (n != t.length()) return false;
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for (int i = 0; i < n; i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c)) return false;
            if (map.get(c) == 0) return false;
            map.put(c, map.get(c)-1);
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}