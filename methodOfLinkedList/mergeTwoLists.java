public class Test0816 {

    class Node {
        int value;
        Node next = null;

        Node(int value) {
            this.value = value;
        }
    }

    private static Node getLast(Node head) {
        if (head == null) {
            return null;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            return cur;
        }

    }


    private static Node mergeTwoLists(Node L1, Node L2) {
        if (L1 == null) {
            return L2;
        }
        if (L2 == null) {
            return L1;
        }

        Node cur1 = L1;
        Node cur2 = L2;
        Node result = null;
        Node rlast = getLast(result);

        while (cur1 != null && cur2 != null) {
            if (cur1.value <= cur2.value) {
                Node next = cur1.next;
                if (result == null) {
                    cur1.next = result;
                    result = cur1;
                } else {
                    cur1.next = null;
                    rlast.next = cur1;
                }
                rlast = cur1;
                cur1 = next;

            } else {
                Node next = cur2.next;
                if (result == null) {
                    result = cur2.next;
                    cur2 = result;
                } else {
                    cur2.next = null;
                    rlast.next = cur2;
                }
                rlast = cur2;
                cur2 = next;
            }

        }

        if (cur1 != null) {
            rlast.next = cur1;
        } else {
            rlast.next = cur2;
        }

        return result;

    }

    private static void display(Node head) {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.value + " --> ");
        }
        System.out.println("null");
    }

    private Node creatList1() {
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        return n1;
    }

    private Node creatList2() {
        Node n1 = new Node(2);
        Node n2 = new Node(4);
        Node n3 = new Node(6);
        Node n4 = new Node(8);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        return n1;
    }

    public static void main(String[] args) {
        Test0816 t1 = new Test0816();
        Test0816 t2 = new Test0816();
        display(t1.creatList1());
        display(t2.creatList2());
        display(mergeTwoLists(t1.creatList1(), t2.creatList2()));
    }
}
