public class Practice {
    public static void main(String[] args) {
        ListNode head = new ListNode('x');

        ListNode other = new ListNode('m');
        head.next = other;

        head.next.next = new ListNode('v');
        head.next.next.next = new ListNode('e');
        head.next.next.next.next = new ListNode('m');

        printList(head);
        countLetter(head, 'm');
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // count how many occurrances of letter in the list
    public static int countLetter(ListNode head, char letter) {
        int letterCount = 0;

        while (head != null) {
            if (head.data == letter) {
                letterCount++;
            }
            
            head = head.next;
        }

        System.out.println(letterCount);
        return letterCount;
    }
}