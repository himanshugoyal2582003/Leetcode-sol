class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode a =head ;
        StringBuilder str = new StringBuilder();
        while(a!=null){
             str.append(a.val);
             a=a.next;
        }
        String c = str.toString();
        String x = str.reverse().toString();
        return x.equals(c);
    }
}