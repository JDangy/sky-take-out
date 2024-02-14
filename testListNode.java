/**
 * 证明java中对象是按照引用传递的
 */
class ListNode {
    int val;
    ListNode next;

    public ListNode(int i) {
        this.val = i;
    }
}
public class testListNode {
    public static void main(String[] args) {
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);

        first.next = second;
        second.next = third;

        ListNode curr = first;
        System.out.println("断裂之前");
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

        curr = first.next;
        curr.next = null;

        curr = first;
        System.out.println("断裂之后");
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
