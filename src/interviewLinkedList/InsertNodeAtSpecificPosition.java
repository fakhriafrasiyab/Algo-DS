package interviewLinkedList;

public class InsertNodeAtSpecificPosition {

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode head = llist;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (llist == null)
            return newNode;
        if (position == 0) {
            newNode.next = llist;
            return newNode;
        }
        int curPos = 0;
        while (curPos < position - 1 && llist.next != null) {
            System.out.println(head);
            llist = llist.next;
            curPos++;
        }
        SinglyLinkedListNode nodeAtPos = llist.next;
        llist.next = newNode;
        llist = llist.next;
        llist.next = nodeAtPos;
        return head;
    }
}
