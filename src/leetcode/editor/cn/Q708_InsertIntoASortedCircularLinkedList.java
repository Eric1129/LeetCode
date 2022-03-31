//给定循环单调非递减列表中的一个点，写一个函数向这个列表中插入一个新元素 insertVal ，使这个列表仍然是循环非降序的。 
//
// 给定的可以是这个列表中任意一个顶点的指针，并不一定是这个列表中最小元素的指针。 
//
// 如果有多个满足条件的插入位置，你可以选择任意一个位置插入新的值，插入后整个列表仍然保持有序。 
//
// 如果列表为空（给定的节点是 null），你需要创建一个循环有序列表并返回这个节点。否则。请返回原先给定的节点。 
//
// 
//
// 示例 1： 
// 
// 
// 
//输入：head = [3,4,1], insertVal = 2
//输出：[3,4,1,2]
//解释：在上图中，有一个包含三个元素的循环有序列表，你获得值为 3 的节点的指针，我们需要向表中插入元素 2 。新插入的节点应该在 1 和 3 之间，插入之后
//，整个列表如上图所示，最后返回节点 3 。
//
//
// 
//
// 示例 2： 
//
// 
//输入：head = [], insertVal = 1
//输出：[1]
//解释：列表为空（给定的节点是 null），创建一个循环有序列表并返回这个节点。
// 
//
// 示例 3： 
//
// 
//输入：head = [1], insertVal = 0
//输出：[1,0]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= Number of Nodes <= 5 * 10⁴ 
// -10⁶ <= Node.val, insertVal <= 10⁶ 
// 
// Related Topics 链表 👍 61 👎 0

package leetcode.editor.cn;
public class Q708_InsertIntoASortedCircularLinkedList{
    public static void main(String[] args) {
        Q708_InsertIntoASortedCircularLinkedList tmp = new Q708_InsertIntoASortedCircularLinkedList();
        Solution solution = tmp.new Solution();
    }

// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};

    //leetcode submit region begin(Prohibit modification and deletion)


class Solution {
    public Node insert(Node head, int insertVal) {
        if (head==null) {
            head = new Node(insertVal);
            head.next = head;
            return head;
        }
        Node prev = head;
        Node curr = head.next;
        boolean toInsert = false;

        do {
            if (prev.val <= insertVal && insertVal <= curr.val) {
                toInsert = true;
            } else if (prev.val > curr.val) {
                if (insertVal >= prev.val || insertVal <= curr.val)
                    toInsert = true;
            }
            if(toInsert) {
                prev.next = new Node(insertVal,curr);
                return head;
            }

            prev = curr;
            curr = curr.next;
        } while (prev != head);

        prev.next = new Node(insertVal,curr);
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
