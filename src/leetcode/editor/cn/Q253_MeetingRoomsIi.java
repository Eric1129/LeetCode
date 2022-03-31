//给你一个会议时间安排的数组 intervals ，每个会议时间都会包括开始和结束的时间 intervals[i] = [starti, endi] ，返回 
//所需会议室的最小数量 。 
//
// 
//
// 示例 1： 
//
// 
//输入：intervals = [[0,30],[5,10],[15,20]]
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：intervals = [[7,10],[2,4]]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= intervals.length <= 10⁴ 
// 0 <= starti < endi <= 10⁶ 
// 
// Related Topics 贪心 数组 双指针 排序 堆（优先队列） 👍 418 👎 0

package leetcode.editor.cn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q253_MeetingRoomsIi{
    public static void main(String[] args) {
        Q253_MeetingRoomsIi tmp = new Q253_MeetingRoomsIi();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals==null || intervals.length == 0) return 0;
        // NlogN
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(intervals[0][1]);
        // NlogN
        for (int i = 1; i < intervals.length; i++) {
            int last = queue.peek();
            if (last <= intervals[i][0]) queue.poll();
            queue.offer(intervals[i][1]);
        }
        return queue.size();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
