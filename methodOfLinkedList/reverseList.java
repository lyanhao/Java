public class Test0815 {

    public class Node {
        public int value;
        public Node next = null;

        public Node(int value) {
            this.value = value;
        }

        public Node() {

        }
    }

    public Node reverseList(Node head) {
        Node cur = head;
        Node rhead = null;

        while (cur != null) {
            Node next = cur.next;

            cur.next = rhead;
            rhead = cur;
            cur = next;
        }

        return rhead;
    }

    public static void display(Node head) {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.value + " --> ");
        }
        System.out.println("null");
    }

    public Node creatList() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        return n1;
    }

    public static void main(String[] args) {
        Test0815 a = new Test0815();
        display(a.creatList());
        a.reverseList(a.creatList());
        display(a.reverseList(a.creatList()));
    }

}


