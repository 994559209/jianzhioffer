package jz3;

import java.util.ArrayList;

public class JZ3 {
    ArrayList<Integer> list = new ArrayList();
    /**
     *从尾到头打印链表
     * 通过递归调用
     * @param listNode 链表
     * @return 反向链表
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
}
