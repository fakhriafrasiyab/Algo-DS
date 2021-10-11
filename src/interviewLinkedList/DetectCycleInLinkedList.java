package interviewLinkedList;

public class DetectCycleInLinkedList {
    class Node {
        int data;
        Node next;
    }

    boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        if (head == null)
            return false;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
