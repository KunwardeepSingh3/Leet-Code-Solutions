class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode current = list;
        int x = 0;
        while (l1 != null || l2 != null || x > 0){
            int sum = x;
            if(l1 != null){
                x += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                x += l2.val;
                l2 = l2.next;
            }
            current.next = new ListNode(x%10);
            current = current.next;
            x = x/10; 
        }
        return list.next;
  }
}
