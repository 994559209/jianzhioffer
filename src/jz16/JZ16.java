package jz16;

public class JZ16 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1==null)return list2;
        if (list2==null)return list1;
        if (list1.val>list2.val){
            list2.next=Merge(list1,list2.next);
            return list2;
        }else {
            list1.next=Merge(list1,list2.next);
            return list1;
        }
    }
}
