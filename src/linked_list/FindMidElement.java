package linked_list;


public class FindMidElement {
    public static void main(String[] args) {
        SingleLinkedList l = LinkedList.createList();
        l.insertLast(1);
        l.insertLast(2);
        l.insertLast(4);
        l.insertLast(5);
        l.insertLast(10);
        l.insertLast(-12);
        l.insertLast(3);
        l.insertAt(4,-15);
        l.insertLast(6);
        l.insertLast(7);
        l.printList();
        System.out.println("Mid: "+  findMid(l));
    }

    public static int findMid(SingleLinkedList l) {
        if(l.isEmpty()) {
            return -1;
        }
        SingleLinkedList.Node slow = l.head;
        SingleLinkedList.Node fast = l.head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
