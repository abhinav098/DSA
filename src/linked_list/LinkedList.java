package linked_list;

public class LinkedList {
    public static SingleLinkedList createList() {
        return new SingleLinkedList();
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.printList();
        list.deleteAt(5);
        list.printList();
    }
}

class SingleLinkedList {
    Node head;

    public void insertFirst(int data) {
        Node first = new Node(data);
        first.next = head;
        head = first;
    }

    public void insertLast(int data) {
        Node new_node = new Node(data);
        if (head == null){
            head = new_node;
        } else {
            Node last = head;
            while(last.next!= null) {
                last = last.next;
            }

            last.next = new_node;
        }
    }

    public void insertAt(int pos, int data) {
        if (pos < 1 || pos > size()){
            throw new IndexOutOfBoundsException("index out of bounds: " + pos);
        }
        Node new_node = new Node(data);
        int i = 1;
        Node curr = head;

        if (pos == 1) {
            insertFirst(data);
        } else {
            if (curr == null) {
                throw new IndexOutOfBoundsException();
            }

            while(i < pos - 1) {
                if(curr.next == null) {
                    throw new IndexOutOfBoundsException();
                }
                curr = curr.next;
                i++;
            }
            new_node.next = curr.next;
            curr.next = new_node;
        }
    }

    public void deleteAt(int pos) {
        if (pos < 1 || pos > size()){
            throw new IndexOutOfBoundsException("index out of bounds: " + pos);
        }

        int i = 1;
        Node curr = head;

        if (pos == 1) {
            deleteFirst();
        } else {
            while(i < pos - 1) {
                if(curr == null) {
                    throw new IndexOutOfBoundsException();
                }
                curr = curr.next;
                i++;
            }
            curr.next = curr.next.next;
        }
    }


    public void printList() {
        Node start = head;
        if (start == null) {
            System.out.println("List is blank!");
        }
        
        while(start != null) {
            System.out.println(start.data);
            start = start.next;
        }
    }

    public int size() {
        int count = 0;
        Node start = head;
        if (start == null) {
            return 0;
        }

        while(start != null) {
            count++;
            start = start.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void deleteFirst() {
        if(!isEmpty()) {
            head = head.next;
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }

    public void deleteLast() {
        Node curr = head;

        if(curr == null) {
            System.out.println(false);
            return;
        }

        // delete first element if only one element
        if(curr.next == null) {
            deleteFirst();
            return;
        }

        // delete element at position if only one element
        while(curr.next.next != null) {
            curr =  curr.next;
        }
        curr.next = null;
    }

    class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}