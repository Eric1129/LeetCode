//n 名士兵站成一排。每个士兵都有一个 独一无二 的评分 rating 。 
//
// 每 3 个士兵可以组成一个作战单位，分组规则如下： 
//
// 
// 从队伍中选出下标分别为 i、j、k 的 3 名士兵，他们的评分分别为 rating[i]、rating[j]、rating[k] 
// 作战单位需满足： rating[i] < rating[j] < rating[k] 或者 rating[i] > rating[j] > rating[
//k] ，其中 0 <= i < j < k < n 
// 
//
// 请你返回按上述条件可以组建的作战单位数量。每个士兵都可以是多个作战单位的一部分。 
//
// 
//
// 示例 1： 
//
// 
//输入：rating = [2,5,3,4,1]
//输出：3
//解释：我们可以组建三个作战单位 (2,3,4)、(5,4,1)、(5,3,1) 。
// 
//
// 示例 2： 
//
// 
//输入：rating = [2,1,3]
//输出：0
//解释：根据题目条件，我们无法组建作战单位。
// 
//
// 示例 3： 
//
// 
//输入：rating = [1,2,3,4]
//输出：4
// 
//
// 
//
// 提示： 
//
// 
// n == rating.length 
// 3 <= n <= 1000 
// 1 <= rating[i] <= 10^5 
// rating 中的元素都是唯一的 
// 
// Related Topics 树状数组 数组 动态规划 👍 80 👎 0

package leetcode.editor.cn;
public class Q1395_CountNumberOfTeams{
    public static void main(String[] args) {
        Q1395_CountNumberOfTeams tmp = new Q1395_CountNumberOfTeams();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int sum = 0;

        // 暴力解法
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                for (int k = j + 1; k < n; k++) {
//                    if ((rating[i] < rating[j] && rating[j] < rating[k])
//                            || (rating[i] > rating[j] && rating[j] > rating[k])) {
//                        sum++;
//                    }
//                }
//            }
//        }

        // 2. 找j
        for (int j = 1; j < n -1; j++) {
            int iLess = 0, iMore = 0;
            int kLess = 0, kMore = 0;

            for (int i = 0; i < j; ++i) {
                if (rating[i] < rating[j]) {
                    iLess++;
                } else {
                    iMore++;
                }
            }

            for (int k = j + 1; k < n; ++k) {
                if (rating[k] < rating[j]) {
                    kLess++;
                } else {
                    kMore++;
                }
            }
            sum += iLess*kMore + iMore*kLess;
        }

        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
