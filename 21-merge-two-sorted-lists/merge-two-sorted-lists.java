class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node to start the merged list
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        // While both lists have nodes
        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next; // move result pointer
        }

        // Attach remaining nodes (only one list will be non-null)
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return dummy.next; // skip dummy node
    }
}
