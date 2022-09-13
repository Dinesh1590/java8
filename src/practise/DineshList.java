package practise;

public class DineshList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
        }
    }

    public void insert(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        ListNode current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print( current.data+" ");
            current = current.next;
        }
        System.out.print("]");
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        DineshList dl = new DineshList();

        dl.insert(10);
        dl.insert(20);

        dl.display();

        System.out.println(dl.length());

    }
}
