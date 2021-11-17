class Node {
    int data;
    Node next = null;

    public Node(final int value) {
        data = value;
        next = null;
    }

    @Override
    public String toString() {
        StringBuilder listToString = new StringBuilder();
        Node thisNode = this;
        while (thisNode != null) {
          listToString.append(thisNode.data + " ");
          thisNode = thisNode.next;
        }
        return listToString.toString().trim();
    }
}

public class ReverseLinkedListLutio1 {
    public static void main(String[] args) {
        // `null` ==> `null`
        Node testHead = null;
        test(testHead, "", true);
        test(testHead, "", false);

        // 1 -> NULL
        testHead = new Node(1);
        test(testHead, "1", true);
        test(testHead, "1", false);

        // 1 -> 2 -> 3 -> NULL
        testHead = new Node(1);
        testHead.next = new Node(2);
        testHead.next.next = new Node(3);
        test(testHead, "3 2 1", true);

        // 1 -> 2 -> 3 -> NULL
        testHead = new Node(1);
        testHead.next = new Node(2);
        testHead.next.next = new Node(3);
        test(testHead, "3 2 1", false);
        
        // 4 -> 3 -> 2 -> 1 -> 0 -> NULL
        testHead = new Node(4);
        testHead.next = new Node(3);
        testHead.next.next = new Node(2);
        testHead.next.next.next = new Node(1);
        testHead.next.next.next.next = new Node(0);
        test(testHead, "0 1 2 3 4", true);

        // 4 -> 3 -> 2 -> 1 -> 0 -> NULL
        testHead = new Node(4);
        testHead.next = new Node(3);
        testHead.next.next = new Node(2);
        testHead.next.next.next = new Node(1);
        testHead.next.next.next.next = new Node(0);
        test(testHead, "0 1 2 3 4", false);
    }

    public static void test(final Node head, final String expected, final boolean withRecursion) {
        String input = (head != null) ? head.toString() : "";
        Node reverseHead = withRecursion ? reverseListRecursive(head, null) : reverseListIterative(head);
        String actual = (reverseHead != null) ? reverseHead.toString() : "";
        
        if (actual.equals(expected)) {
          System.out.println("✔️  Test Success!");
        } else {
          System.out.println("❌ Test Failed!");
          System.out.println("\t- Input : \"" + input + "\"");
          System.out.println("\t- Expected : \"" + expected + "\"");
          System.out.println("\t- Received : \"" + actual + "\"");
        }
      }

    public static Node reverseListIterative(Node head) {
        Node curr = head, prev = null;

        while (curr != null) {
            Node tmp = curr.next;
            curr.next = prev;
            head = prev = curr;
            curr = tmp;
        }

        return head;
    }

    public static Node reverseListRecursive(Node curr, Node prev) {
        if (curr == null) {
            return null;
        }

        if (curr.next == null) {
            curr.next = prev;
            return curr;
        }

        Node head = reverseListRecursive(curr.next, curr);
        curr.next = prev;
        return head;
    }

}
