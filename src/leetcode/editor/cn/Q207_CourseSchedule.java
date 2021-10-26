//你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1 。 
//
// 在选修某些课程之前需要一些先修课程。 先修课程按数组 prerequisites 给出，其中 prerequisites[i] = [ai, bi] ，表
//示如果要学习课程 ai 则 必须 先学习课程 bi 。 
//
// 
// 例如，先修课程对 [0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。 
// 
//
// 请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：numCourses = 2, prerequisites = [[1,0]]
//输出：true
//解释：总共有 2 门课程。学习课程 1 之前，你需要完成课程 0 。这是可能的。 
//
// 示例 2： 
//
// 
//输入：numCourses = 2, prerequisites = [[1,0],[0,1]]
//输出：false
//解释：总共有 2 门课程。学习课程 1 之前，你需要先完成​课程 0 ；并且学习课程 0 之前，你还应先完成课程 1 。这是不可能的。 
//
// 
//
// 提示： 
//
// 
// 1 <= numCourses <= 10⁵ 
// 0 <= prerequisites.length <= 5000 
// prerequisites[i].length == 2 
// 0 <= ai, bi < numCourses 
// prerequisites[i] 中的所有课程对 互不相同 
// 
// Related Topics 深度优先搜索 广度优先搜索 图 拓扑排序 👍 979 👎 0

package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.List;

public class Q207_CourseSchedule{
    public static void main(String[] args) {
        Q207_CourseSchedule tmp = new Q207_CourseSchedule();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    boolean[] visited;
    boolean[] onPath;
    boolean hasCycle = false;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = buildGraph(numCourses, prerequisites);
        visited = new boolean[numCourses];
        onPath = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++){
            // 遍历图中所有节点
            traverse(graph, i);
        }
        return !hasCycle;
    }

    public void traverse(List<Integer>[] graph, int s){
        if (onPath[s]){
            hasCycle = true;
        }

        if (visited[s] || hasCycle){
            return;
        }

        visited[s] = true;
        onPath[s] = true;
        for (int t : graph[s]){
            traverse(graph, t);
        }
        onPath[s] = false;
    }

    List<Integer>[] buildGraph(int numCourses, int[][] prerequisites){
        // 图中共有numCourses个节点
        List<Integer>[] graph = new LinkedList[numCourses];
        for (int i = 0; i < numCourses; i++){
            graph[i] = new LinkedList<>();
        }
        for (int[] edge : prerequisites){
            int from = edge[1];
            int to = edge[0];
            // 修完课程from才能修课程to
            // 所以在图中舔一条边
            graph[from].add(to);
        }
        return graph;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
