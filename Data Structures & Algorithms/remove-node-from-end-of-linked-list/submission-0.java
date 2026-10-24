class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> arr = new ArrayList<>();
        ListNode cur = head;

        while (cur != null) {
            arr.add(cur);
            cur = cur.next;
        }

        // Convert the nth node from the end to its zero-based index.
        int indexToRemove = arr.size() - n;
        arr.remove(indexToRemove);

        // Reconnect the remaining nodes.
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).next = (i + 1 < arr.size()) ? arr.get(i + 1) : null;
        }

        return arr.isEmpty() ? null : arr.get(0);
    }
}