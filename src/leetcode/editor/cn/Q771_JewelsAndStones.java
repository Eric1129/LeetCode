//给你一个字符串 jewels 代表石头中宝石的类型，另有一个字符串 stones 代表你拥有的石头。 stones 中每个字符代表了一种你拥有的石头的类型，
//你想知道你拥有的石头中有多少是宝石。 
//
// 字母区分大小写，因此 "a" 和 "A" 是不同类型的石头。 
//
// 
//
// 示例 1： 
//
// 
//输入：jewels = "aA", stones = "aAAbbbb"
//输出：3
// 
//
// 示例 2： 
//
// 
//输入：jewels = "z", stones = "ZZ"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= jewels.length, stones.length <= 50 
// jewels 和 stones 仅由英文字母组成 
// jewels 中的所有字符都是 唯一的 
// 
//
// Related Topics哈希表 | 字符串 
//
// 👍 726, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;

public class Q771_JewelsAndStones{
    public static void main(String[] args) {
        Q771_JewelsAndStones tmp = new Q771_JewelsAndStones();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsSet = new HashSet<>();
        for (char c:jewels.toCharArray()) {
            jewelsSet.add(c);
        }
        int count=0;
        for (char c : stones.toCharArray()) {
            if (jewelsSet.contains(c)) count++;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}