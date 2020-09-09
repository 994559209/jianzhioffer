package jz14;


public class JZ14 {

    /**
     * 通过双指针
     * node1先走K-1步 到达K结点 然后两个指针一起走node1到达末尾
     * node2的位置就是倒数第K个结点的位置
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }

        ListNode node1 = head;
        ListNode node2 = head;

        for (int i = 0; i < (k - 1); i++) {
            if (node1.next != null) {
                node1 = node1.next;
            } else return null;
        }

        while (node1.next != null) {
            node1 = node1.next;
            node2 = node2.next;
        }

        return node2;
    }
}
