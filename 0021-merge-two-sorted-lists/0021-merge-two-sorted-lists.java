import java.util.Vector;
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        Vector<Integer> arr = new Vector<>();
        while(list1!=null){
             arr.add(list1.val);
             list1=list1.next;
        }
        while(list2!=null){
             arr.add(list2.val);
             list2=list2.next;
        }
        Collections.sort(arr);
        ListNode list = new ListNode(-1);
        ListNode curr = list;

        for (int x : arr) {
            curr.next = new ListNode(x);
            curr = curr.next;
        }

        return list.next;
    }
}