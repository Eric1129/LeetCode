//写一个程序，输出从 1 到 n 数字的字符串表示。 
//
// 1. 如果 n 是3的倍数，输出“Fizz”； 
//
// 2. 如果 n 是5的倍数，输出“Buzz”； 
//
// 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。 
//
// 示例： 
//
// n = 15,
//
//返回:
//[
//    "1",
//    "2",
//    "Fizz",
//    "4",
//    "Buzz",
//    "Fizz",
//    "7",
//    "8",
//    "Fizz",
//    "Buzz",
//    "11",
//    "Fizz",
//    "13",
//    "14",
//    "FizzBuzz"
//]
// 
// Related Topics 数学 字符串 模拟 👍 115 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class Q412_FizzBuzz{
    public static void main(String[] args) {
        Q412_FizzBuzz tmp = new Q412_FizzBuzz();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fb = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            String tmp = "";
            if(i % 15 == 0){
                fb.add("FizzBuzz");
            } else if(i % 3 == 0){
                fb.add("Fizz");
            } else if(i % 5 == 0){
                fb.add("Buzz");
            } else {
                fb.add(""+i);
            }
        }
        return fb;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
