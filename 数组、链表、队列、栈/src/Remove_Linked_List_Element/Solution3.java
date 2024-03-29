package Remove_Linked_List_Element;

/**
 * Recursion与链表的关系
 * 利用Recursion解决删除链表中某个元素的问题
 */
public class Solution3 {
    public ListNode removeElements(ListNode head, int val){
        if (head == null){
            return null;
        }
        ListNode res = removeElements(head.next, val);
        if (head.val == val){
            return res;
        }else {
            head.next = res;
            return head;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 6, 3, 4, 5, 6 };
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution3()).removeElements(head, 6);
        System.out.println(res);
    }
}
