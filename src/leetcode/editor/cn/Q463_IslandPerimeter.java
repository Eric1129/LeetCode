//给定一个 row x col 的二维网格地图 grid ，其中：grid[i][j] = 1 表示陆地， grid[i][j] = 0 表示水域。 
//
// 网格中的格子 水平和垂直 方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。 
//
// 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿
//的周长。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
//输出：16
//解释：它的周长是上面图片中的 16 个黄色的边 
//
// 示例 2： 
//
// 
//输入：grid = [[1]]
//输出：4
// 
//
// 示例 3： 
//
// 
//输入：grid = [[1,0]]
//输出：4
// 
//
// 
//
// 提示： 
//
// 
// row == grid.length 
// col == grid[i].length 
// 1 <= row, col <= 100 
// grid[i][j] 为 0 或 1 
// 
// Related Topics 深度优先搜索 广度优先搜索 数组 矩阵 👍 525 👎 0

package leetcode.editor.cn;
public class Q463_IslandPerimeter{
    public static void main(String[] args) {
        Q463_IslandPerimeter tmp = new Q463_IslandPerimeter();
        Solution solution = tmp.new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i<grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (grid.length == 1) {
                        perimeter+=2;
                    } else {
                        if (i == 0) {
                            perimeter++;
                            perimeter += grid[i+1][j] == 0 ? 1 : 0;
                        }
                        else if ( i == grid.length-1 ) {
                            perimeter++;
                            perimeter += grid[i-1][j] == 0 ? 1 : 0;
                        }
                        else {
                            perimeter += grid[i+1][j] == 0 ? 1 : 0;
                            perimeter += grid[i-1][j] == 0 ? 1 : 0;
                        }
                    }

                    if (grid[0].length == 1) {
                        perimeter+=2;
                    } else {
                        if (j == 0) {
                            perimeter++;
                            perimeter += grid[i][j+1] == 0 ? 1 : 0;
                        }
                        else if ( j == grid[0].length-1 ) {
                            perimeter++;
                            perimeter += grid[i][j-1] == 0 ? 1 : 0;
                        }
                        else {
                            perimeter += grid[i][j+1] == 0 ? 1 : 0;
                            perimeter += grid[i][j-1] == 0 ? 1 : 0;
                        }
                    }

                }
            }
        }
        return perimeter;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
