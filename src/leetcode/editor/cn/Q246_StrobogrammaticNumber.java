//中心对称数是指一个数字在旋转了 180 度之后看起来依旧相同的数字（或者上下颠倒地看）。 
//
// 请写一个函数来判断该数字是否是中心对称数，其输入将会以一个字符串的形式来表达数字。 
//
// 
//
// 示例 1: 
//
// 输入: num = "69"
//输出: true
// 
//
// 示例 2: 
//
// 输入: num = "88"
//输出: true 
//
// 示例 3: 
//
// 输入: num = "962"
//输出: false 
//
// 示例 4： 
//
// 输入：num = "1"
//输出：true
// 
// Related Topics 哈希表 双指针 字符串 👍 40 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class Q246_StrobogrammaticNumber{
    public static void main(String[] args) {
        Q246_StrobogrammaticNumber tmp = new Q246_StrobogrammaticNumber();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isStrobogrammatic(String num) {
        Map<Character,Character> map=new HashMap<>();
        map.put('6','9');
        map.put('9','6');
        map.put('1','1');
        map.put('8','8');
        map.put('0','0');
        int left = 0;
        int right = num.length()-1;

        while (left <= right) {
            if (map.get(num.charAt(left)) == null) return false;
            if (map.get(num.charAt(left)) != num.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}