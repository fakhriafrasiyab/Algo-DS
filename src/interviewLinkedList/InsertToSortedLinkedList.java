package interviewLinkedList;

public class InsertToSortedLinkedList {
    static class DoublyLinkedListNode {
        int data;
        DoublyLinkedListNode next;
        DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int data) {
            this.data = data;
        }
    }

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        DoublyLinkedListNode current;
        if (llist == null)
            return newNode;
        else if (llist.data >= newNode.data) {
            newNode.next = llist;
            newNode.next.prev = newNode;
            llist = newNode;
        } else {
            current = llist;
            while (current.next != null && current.data < newNode.data)
                current = current.next;
            newNode.next = current.next;
            if (current.next != null)
                newNode.next.prev = newNode;
            current.next = newNode;
            newNode.prev = current;
        }
        return llist;
    }
}
